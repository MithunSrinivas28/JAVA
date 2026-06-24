# The first file consists of the player details : Player.java

## Abstraction

* Used an abstract class `Player` because a generic player should not be instantiated directly.
* The class contains common attributes and declares an abstract method `displayStats()`, while leaving the implementation details to subclasses such as `Batsman`, `Bowler`, and `AllRounder`.

## Encapsulation

* I binded data and methods in a single class to make sure they are secure and cannot be easily manipulated.
* They can only be accessed through getters and setters.
* The attributes are set to `private` to achieve encapsulation and protect the data.

## Why Abstract Class Instead of Interface?

* I used an abstract class because all players share common state (`name`, `age`, `jerseyNumber`) and behavior, whereas an interface is mainly used to define a contract without storing shared instance data.

# The second file consists of the batsman details : Batsman.java

## Inheritance

* Implemented inheritance by extending the `Player` class.
* The `Batsman` inherits the `Player` class attributes and methods like `name`, `age`, and `jerseyNumber`.
* This avoids code duplication and promotes code reuse.

## Constructor Chaining

* Implemented constructor chaining using the `super()` keyword.
* The `super()` call invokes the constructor of the parent `Player` class to initialize the inherited attributes.

## Method Overriding

* Implemented method overriding where a subclass provides its own implementation of a method declared in the parent class.
* The `displayStats()` method is declared in the `Player` class and implemented specifically in the `Batsman` class.
* This allows different player types to display their statistics in different ways.
