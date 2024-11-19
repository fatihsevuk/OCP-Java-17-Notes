# Creating and manipulating Strings

String is a char sequence.

```java
String text = "lorem ipsum....";
```

String is a special reference type and it doesn't need new keyword to create object.

```java

String name = "MrRobot";
String name = new String("MrRobot");
String name = """
        MrRobot""";

// This 3 definition is same.


```
* String implements CharSequence interface like StringBuilder

## Concatenation

* In Java 1+2 is 3 but "1"+"2" = "12"
* If two operands are numeric , + means numeric addition
* If one operand is a String , + means concatenation
* Expression is evaluated left to right

```java

        System.out.println(1+2); 
        System.out.println("a"+"b");
        System.out.println("a"+"b"+3);
        System.out.println(1+2+"c");
        System.out.println("c"+1+2);
        System.out.println("c"+null);
        

```
OUTPUT
```java
3
ab
ab3
3c
c12
cnull
```
## Important String Methods

* String is a char sequence
* first index is 0
* String is immutable and unchangeable
* Ths means calling a method on String doesn't change the value of reference only return a different String object

### length()

Return number of character in String

```java
String name = "MrRobot";
System.out.println(name.lengt()); // 7
```

### charAt()

Get single character from String with given index

```java
String name = "MrRobot";
System.out.println(name.charAt(0)) // M
System.out.println(name.charAt(5)) // 0
```

### indexOf()

Finding index of given char

```java
// the method has following signatures

// public int indexOf(int ch)
// public int indexOf(int ch , int fromIndex)
// public int indexOf(String str)
// public int indexOf(String str , int fromIndex)

        var name = "MrRobot";
        System.out.println(name.indexOf('R')); // 2
        System.out.println(name.indexOf("bo")); // 4
        System.out.println(name.indexOf("o",4)); // 5
        System.out.println(name.indexOf("ob",2)); // 3
        System.out.println(name.indexOf("obx",2)); // -1    

```

### substring()

```java
        System.out.println(name.substring(3)); // obot
        System.out.println(name.substring(name.indexOf('b'))); // bot
        System.out.println(name.substring(3,6)); // obo
        System.out.println(name.substring(3,3)); // empty string
        //  System.out.println(name.substring(3,8)); // exception
        // System.out.println(name.substring(3,2)); // exception
```

### Lowercase and uppercase

* toLowerCase()
* toUpperCase()

## equals and equalsIgnoreCase

* equals checks whether two objects has same value
* for custom object you need to override this equals method
* if you override equals then you need to override hasCode as well

### startsWith,endsWith,contains

### replace

* replace(char oldChar, char newChar)
* replace(CharSequence target , CharSequence replacement)

### trim() , strip()