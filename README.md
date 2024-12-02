# <center>DESIGN PATTERN</center>

    -> Design patterns are the well proved solution of commonly occurring problems in software design.

### <center>CATEGORIZATION DESIGN PATTERN</center>

    · Creational Design Pattern
        -> Factory Pattern, Builder Pattern, Singleton pattern etc

    . Structural Design Pattern
        -> Proxy pattern, Adaptor pattern etc

    · Behavioral Design Pattern
        -> Observer Pattern State Pattern, Iterator Pattern etc

#### Singleton Pattern (Allow uaer to create only one object) : <span style="margin-left: 20px;">[· Lazy way](https://github.com/krtuhin/Design_Patterns/blob/singleton/singleton/Student.java)</span><span style="margin-left: 20px;">[· Eager way](https://github.com/krtuhin/Design_Patterns/blob/singleton/singleton/Teacher.java)</span>

#### Break Singleton Pattern :

    1. Reflection API
    -> Sol - if object is there, throw exception from constructor.

    2. Deserialization
    -> Sol - implement readResolve method

    3. Object clone
    -> Sol - override clone method

#### Factory Design Pattern / Factory Method Design Pattern :

    -> When there is superclass and multiple subclasses and we want to get object of subclasses based on input and requirement.
    -> Then we create factory class which takes the responsibility of creating object of class based on input.

##### Advantages of Factory Design Pattern :

    1. Focus on creating object for Interface rather than implementation.
    2. Loose coupling, more robust code

#### Abstract Factory Design Pattern :

    -> Similar to Factory Pattern
    -> It provide the concept of Factory of Factorias.

#### Builder Design Pattern :

    -> While creating object when object contain may attributes there are many problem exists :

1. We have to pass many arguments to create object.
2. Some parameters might be optional
3. Factory class takes all responsibility for creating object. If the object is heavy then all complexity is the part of factory class.

So in builder pattern be create object step by step and finally return final object with desired values of attributes.

#### Prototype Design Pattern

    -> The concept is to copy an existing object rather than creating a new instance from scratch. because creating new object may be costly.
    -> This approach saves costly resources and time, especially when object creation is a heavy process.

##### Types of prototype pattern :

    . Shallow Copy -> When copying an object, if the object has another object as a property, the new object will copy the reference of that property object. Hence, if we change any property of the object from any object, it will also reflect on all other objects, as it copies the reference only, not the actual object.

    . Deep Copy -> Unlike the shallow copy, it copies all the objects rather than the reference of the same objects.

#### Observer Design Pattern :

    -> It is behavioural Design pattern.
    -> In this when subject changes the state all its dependent objects notified the changes.
    -> One to many relation.

#### Iterator Design Pattern

    -> The iterator pattern provides a way to access the elements of an object without exposing its underlying implementation.

#### Adapter Design Pattern :

    -> When two Objects are incompatible with each other, then with the adapter class we can provide an interface so the objects can be compatible with each other.
