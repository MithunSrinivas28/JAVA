# Java Practice and Notes

This repository contains my Java practice, notes, and mini-projects. The focus is on learning concepts by building small projects and understanding the reasoning behind the code.

## Cricket Team Management System

A mini-project built to understand Object-Oriented Programming (OOP) concepts through implementation.

### Concepts Implemented

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Method Overriding
* Constructor Chaining
* Composition
* Upcasting
* Dynamic Method Dispatch

### Key Learnings

* Used an abstract `Player` class to represent common player behavior.
* Extended `Player` into `Batsman`, `Bowler`, and `AllRounder` using inheritance.
* Overrode `displayStats()` in each subclass to achieve polymorphism.
* Used `super()` to initialize inherited attributes through constructor chaining.
* Stored child objects inside parent references to understand runtime polymorphism.
* Created a `Team` class that contains multiple players to understand composition and the HAS-A relationship.
* Learned why Java does not support multiple inheritance through classes and how interfaces solve that problem.
