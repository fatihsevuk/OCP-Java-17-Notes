### Initialize Instance of X
1. Initialize class X if it has not been previously initialized.
2. If there is a superclass Y of X, then initialize the instance of Y first.
3. Process all instance variable declarations in the order in which they appear in the class.
4. Process all instance initializers in the order in which they appear in the class.
5. Initialize the constructor, including any overloaded constructors referenced with this().

We conclude this section by listing important rules you should know for the exam:

* A class is initialized at most once by the JVM before it is referenced or used.
* All static final variables must be assigned a value exactly once, either when they
are declared or in a static initializer.
* All final fields must be assigned a value exactly once, either when they are declared, in an
instance initializer, or in a constructor.
* Non-final static and instance variables defined without a value are assigned a
default value based on their type.
* Order of initialization is as follows: variable declarations, then initializers, and finally
constructors.

To override a method, you must follow a number of rules. The compiler performs the fol-
lowing checks when you override a method:

1. The method in the child class must have the same signature as the method in the
parent class.
2. The method in the child class must be at least as accessible as the method in the
parent class.
3. The method in the child class may not declare a checked exception that is new or
broader than the class of any exception declared in the parent class method.
4. If the method returns a value, it must be the same or a subtype of the method in the par-
ent class, known as covariant return types.
