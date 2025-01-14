package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        chicken c = new chicken();
        c.eat();
        c.walk();
    }
    
}

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
        }
    void eat(){
        System.out.println("Animal eats");
    }
    //don't need to define the body of the method
    abstract void walk();
}

class Horse extends Animal{
    void changecolor(){
        color = "Brown";
        }
    //need to use of function walk it necessary to define the body of the method
    void walk(){
        System.out.println("Horse walks in 4 legs");
    }
}
class chicken extends Animal{
    void chnageColor(){
        color = "Brown";
        }
    //need to use of function walk it necessary to define the body of the method
    void walk(){
        System.out.println("Chicken walks in 2 legs");
    }
}