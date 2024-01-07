# Chapter-3 - Making Decision

## Pattern Matching

### Subtypes

* Pattern variables must be subtype of variable on the left side.

### Flow Scoping

+ Pattern variable is only in scope when the compiler can definitively determine its type.
+ it is based on compiler branching and program flow unlike any other scope like class, local, instance...

## Applying Switch Statements

* If we have a lot of condition , we can think handle them with if statements but it would be difficult to manange and maintain 
* Java has switch expression to handle multi condition situations

### Switch Statement

* switch statements take variable to test and flow is redirected to the first matching branch known case
* if there is no matching case flow is redirected to optional default block
* if there is no default block, then entire switch statement wil be skipped.
* with Java 14 , the case values can be combined

```java

class Test {
    
    
    void test() {
        
        // with java 14
        switch(animal) {
            case 1,2: System.out.println("Lorem");
            case 3: System.out.println("Ipsum"); 
        }
        
        // before java 14
        switch(animal) {
            case 1: case 2: System.out.println("Lorem");
            case 3: System.out.println("Ipsum");
        }
        
    }
    
}


```

### Note

* Switch statements variable must have around parentheses
* The parentheses must be existed around switch body
* The comma must be between combined cases.
* Switch statements is not required to contain any case statements
* if there is no break statement after cases the flow will continue to next case statement after matching case including default
* default is not required to be at the end of switch


### Exam Tip

* pay attention to missing break statement
* multiple branch can be visited in a single execution


### Supported Data Type in Switch

* int, Integer
* byte, Byte
* short, Short
* char, Character
* String
* enum values
* var (if the type resolve to one of the preceding types)

### Not permitted data types

* long, float,double,boolean
* Long,Float,Double,Boolean

### Acceptable Case Values
* the case values must be compile time constant values of the same data type as the switch value
* case statement cannot have method that return a value same data type as switch value , since this method is not compile time constant

### Switch Expression
* with java 14
* compact form of switch statements
* switch statements are assigned to a result variable
* every case and default statements return result with -> operator.

```java
public String printDayOfWeek2(int day) {
    var result = switch(day) {
        case 0 -> "Sunday" ;
        case 1 -> "Monday" ;
        case 2 -> "Tuesday" ;
        case 3 -> "Wednesday" ;
        case 4 -> "Thursday" ;
        case 5 -> "Friday" ;
        case 6 -> "Saturday" ;
        default-> "Invalid Value";
    };
    return result;
}
```

### Note

* There is semicolon after each switch expression, :star::star::star:

### Returning Consistent Data Type
* You cannot return incompatible or random data type. 

### yield keyword
* Switch expression supports expression and block in case and default branches. 
* If there is a block in case or default branches and switch expression return a value , then you must be yield a value in block in default or case branch.

:star: We need to pay attention to the use of semicolons in the exam. The main switch block must end with a semicolon, and if the case and default branches do not make a return inside, they must end with a semicolon. If they make a return inside, yiled is used and in this case, the yield return ends with a semicolon, and there is no need for an extra semicolon.

### Covering all possible values
* Every switch expression mus handle all possible values of the switch variable.

```java
// Does not compile
String type = switch(canis) {
  case 1 -> "dog";
  case 2 -> "wolf";
  case 3 -> "coyote";
};

// because switch expression doesn't handle all possible situation,
// we cannot determine type of return if canis is 5 , type can be null , empty string or undefined or some other values

```

To fix this we have two options,
* default block

or

+ Enum Type switch variable and cases for every enum types. If number of enum type are small then this option is easy to apply.

:star: If switch variable is an enum, then switch must handle all type of enum, if enum has 4 type and switch has 3 type the code doesn't compile to fix this we should always add default branch to all switch expression.


## Writing while Loops

* loops -> same task but multiple time
* loop continues if booleanExpression is true, exits if booleanExpression is false.

```java
while (booleanExpression) {
    //Body
}
```
### Do While

* do/while loop guarantees that statement or block will be executed at least once. 

```java

int number = 2
do {
    number++;
}
while (false);
System.out.println(number);
```


### Infinite Loops

* Every repetition process should always terminate
* If not they cause some problems such as overflow exceptions,memory leaks,slow performance,bad data.


## Constructing for Loops

There are two types of for loops
* basic for loop
* enhanced for loop or for-each loop

### Edge Cases of For Loop

#### Creating Infinite Loop

```java

for( ; ; ) 
    System.out.println("Hello World");
```

Note: the all component of for loop is optional.

#### Adding multiple terms to the for statement

```java

int x = 0;

for (long y=0,z=4;x<5 && y<10;x++,y++) {
    System.out.println(y+ " ")    
}
        
System.out.println(x+ " ")
```



    



