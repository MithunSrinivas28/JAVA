i will write my understanding here

# The first file consists of the player details : Player.java
i implemented oops here 
but how??

abstraction : used an abstract class Player because a generic player should not be instantiated directly. The class contains common attributes and declares an abstract method displayStats(), while leaving the implementation details to subclasses such as Batsman, Bowler, and AllRounder.

encapsulation: i binded data and methods in a single class to make sure they are secure and cannot be easily manipluated they can only be accesed tthough getters and setters 

the things are set provate to achieve encapsulation and protect the data 

I used an abstract class because all players share common state (name, age, jerseyNumber) and behavior, whereas an interface is mainly used to define a contract without storing shared instance data.

# the second file consists of the batsman details : Batsman.java

