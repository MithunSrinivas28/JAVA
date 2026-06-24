# Cricket Team Management System - OOP Concepts

## File 1: Player.java

### Abstraction

* Used an abstract class `Player` because a generic player should not be instantiated directly.
* The class contains common attributes and declares an abstract method `displayStats()`, while leaving the implementation details to subclasses such as `Batsman`, `Bowler`, and `AllRounder`.

### Encapsulation

* I binded data and methods in a single class to make sure they are secure and cannot be easily manipulated.
* They can only be accessed through getters and setters.
* The attributes are set to `private` to achieve encapsulation and protect the data.

### Why Abstract Class Instead of Interface?

* I used an abstract class because all players share common state (`name`, `age`, `jerseyNumber`) and behavior, whereas an interface is mainly used to define a contract without storing shared instance data.

### Constructor

* A constructor is used to initialize the object at the time of creation.
* Every player object must have a name, age, and jersey number when it is created.

---

## File 2: Batsman.java

### Inheritance

* Implemented inheritance by extending the `Player` class.
* The `Batsman` inherits the `Player` class attributes and methods like `name`, `age`, and `jerseyNumber`.
* This avoids code duplication and promotes code reuse.

### Constructor Chaining

* Implemented constructor chaining using the `super()` keyword.
* The `super()` call invokes the constructor of the parent `Player` class to initialize the inherited attributes.

### Method Overriding

* Implemented method overriding where a subclass provides its own implementation of a method declared in the parent class.
* The `displayStats()` method is declared in the `Player` class and implemented specifically in the `Batsman` class.
* This allows different player types to display their statistics in different ways.

---

## File 3: Bowler.java

### Inheritance

* Implemented inheritance by extending the `Player` class.
* The `Bowler` class inherits common player attributes and methods such as `name`, `age`, `jerseyNumber`, and their getters.
* This promotes code reuse and avoids duplicating common player-related code.

### Constructor Chaining

* Used the `super()` keyword to call the constructor of the parent `Player` class.
* The parent constructor initializes the inherited player attributes, while the `Bowler` constructor initializes the bowler-specific attribute `wickets`.

### Method Overriding

* Overrode the abstract method `displayStats()` declared in the `Player` class.
* The `Bowler` class provides its own implementation to display wicket-related statistics.
* This allows each player type to define its own version of displaying statistics.

---

## File 4: AllRounder.java

### Inheritance

* Implemented inheritance by extending the `Player` class.
* The `AllRounder` class inherits all common player attributes and methods from the parent class.

### Constructor Chaining

* Used the `super()` keyword to initialize the inherited player attributes.
* The `AllRounder` constructor additionally initializes both `runs` and `wickets`.

### Method Overriding

* Overrode the `displayStats()` method declared in the parent class.
* The `AllRounder` class provides its own implementation to display both batting and bowling statistics.

### Why Not Multiple Inheritance?

* An `AllRounder` logically has both batting and bowling abilities.
* However, Java does not support multiple inheritance through classes because of the Diamond Problem.
* Therefore, `AllRounder` is modeled as another subclass of `Player` containing both `runs` and `wickets`.
* Java achieves multiple inheritance using interfaces.

---

## File 5: Main.java

### Object Creation

* Objects of `Batsman`, `Bowler`, and `AllRounder` are created using constructors.
* These objects represent real players in the system.

### Upcasting

* Child class objects are stored inside parent class references.

Example:

```java
Player p1 = new Batsman(...);
Player p2 = new Bowler(...);
Player p3 = new AllRounder(...);
```

* This is possible because every `Batsman`, `Bowler`, and `AllRounder` is a `Player`.

### Runtime Polymorphism

* Runtime polymorphism is achieved using parent class references and child class objects.
* Java determines at runtime which overridden method should be executed.

Example:

```java
p1.displayStats();
```

* Even though `p1` is a `Player` reference, Java executes the `Batsman` version of `displayStats()` because the actual object is a `Batsman`.

### Dynamic Method Dispatch

* The decision regarding which overridden method should execute is made at runtime.
* This mechanism is called Dynamic Method Dispatch and is the foundation of Runtime Polymorphism.

---

## File 6: Team.java

### Composition

* Implemented composition using a HAS-A relationship.
* A `Team` contains multiple `Player` objects.

Example:

```java
private List<Player> players;
```

* A team is not a player, but a team has players.

### Polymorphism with Collections

* The team stores all player types using a common `Player` reference.

Example:

```java
List<Player> players;
```

* This allows `Batsman`, `Bowler`, and `AllRounder` objects to be stored in the same collection.

### Aggregation vs Composition

* The relationship between `Team` and `Player` demonstrates composition.
* A team is composed of multiple players.
* This models a HAS-A relationship.

---

# OOP Concepts Covered

* Encapsulation
* Abstraction
* Inheritance
* Method Overriding
* Constructor Chaining
* Runtime Polymorphism
* Dynamic Method Dispatch
* Upcasting
* Composition
* Abstract Classes
* Multiple Inheritance (Concept)
* Diamond Problem
* Aggregation vs Composition

# Key Relationships

### IS-A Relationship

```text
Batsman IS-A Player
Bowler IS-A Player
AllRounder IS-A Player
```

Used for inheritance.

### HAS-A Relationship

```text
Team HAS-A Players
```

Used for composition.

# Interview Summary

### Encapsulation

Hiding data using private access modifiers and providing controlled access through methods.

### Abstraction

Hiding implementation details and exposing only essential functionality through abstract classes or interfaces.

### Inheritance

Acquiring properties and methods from a parent class.

### Polymorphism

One parent reference representing multiple child objects.

### Method Overriding

Providing a subclass-specific implementation of a method already declared in the parent class.

### Composition

Building complex objects by combining simpler objects through HAS-A relationships.
