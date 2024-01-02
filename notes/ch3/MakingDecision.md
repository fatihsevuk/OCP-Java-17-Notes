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

* There is semicolon after each switch statement
* 