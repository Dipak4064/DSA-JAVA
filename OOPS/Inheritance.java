package OOPS;
/* the inheritance has four types that are---
 * 1. Single level inheritance
 * 2. Multilevel inheritance
 * 3. Hierarchical inheritance
 * 4. Hybrid inheritance
 * 5. Multiple inheritance
 * 6. Multipath inheritance
 * 7. Cyclic inheritance
 */

public class Inheritance {
    public static void main(String[] args) {
        //single level inheritance
        // Fish shark = new Fish();
        // shark.eat();

        //multilevel inheritance
        Dog Dobby = new Dog();
        Dobby.legs=4;
        Dobby.breathe();
        System.out.println(Dobby.legs);
    }
    
}
//inheritance
//Base class
class Animal{
String color;
void eat(){
    System.out.println("Animal is eating....");
}
void breathe(){
    System.out.println("Animal is breathing....");
}
}
/*----------------------------------------------------- */
//Derived class
//this is a signle level inheritance
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish is swimming....");
    }
}
/*-------------------------------------------------------- */

/*------------------------------------------------------ */
//this is a multilevel inheritance
class Mamals extends Animal{
    int legs;
}
class Dog extends Mamals{
    void bark(){
        System.out.println("Dog is barking....");
    }
}
/*------------------------------------------------------ */

/*------------------------------------------------------ */
//this is a hierarchical inheritance
class Fishh extends Animal{
    int fins;
    void swim(){
        System.out.println("Fish is swimming....");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing....");
    }
}
class bird extends Animal{
   void fly(){
       System.out.println("Bird is flying....");
   }
}
/*------------------------------------------------------ */


 /*-------------------------------------------------------- */
 //this is a hybrid inheritance
    class Mamalss extends Animal{
        int legs;
    }
    class Dogg extends Mamalss{
        void bark(){
            System.out.println("Dog is barking....");
        }
    }
    class Cat extends Mamalss{
        void meow(){
            System.out.println("Cat is meowing....");
        }
    }
    class Lion extends Mamalss{
        void roar(){
            System.out.println("Lion is roaring....");
        }
    }
    class Tiger extends Animal{
        void growl(){
            System.out.println("Tiger is growling....");
        }
    }
    class TigerChild extends Tiger{
        void growl(){
            System.out.println("TigerChild is growling....");
        }
    }
/*-------------------------------------------------------- */

