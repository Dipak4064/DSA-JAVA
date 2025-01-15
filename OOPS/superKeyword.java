package OOPS;
public class superKeyword {

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);
    }
}

class Animal {

    String color;

    Animal() {
        System.out.println("Animal is created");
    }
}

class Dog extends Animal {

    Dog() {
        //super(); automatically called by method by compiler
        super();
        super.color = "white";
        System.out.println("Dog is created");
    }
}
