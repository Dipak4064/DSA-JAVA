package OOPS;
public class Polymorphism {
 public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.sum(5,5));
    System.out.println(c.sum(5,5,5));
    System.out.println(c.sum((float)1.4,(float)2.5));

    //Now for class overriding
    deer d = new deer();
    d.eat();
 }   
}
/*------------------------------------------------------- */
//class overloading
//This a Compile time polymorphism
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
}
/*------------------------------------------------------- */


/*------------------------------------------------------- */
//class overriding
//This a Run time polymorphism
class Animal{
    void eat(){
        System.out.println("Animal eating anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Deer eating grass");
    }
}
/*------------------------------------------------------- */