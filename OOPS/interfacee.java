package OOPS;

public class interfacee {
    public static void main(String[] args) {
        
        //interface
        // Queen q = new Queen();
        // q.moves();


        //multiple inheritance By using the interface
        Bear b = new Bear();
        b.graze();
        b.eat();
        b.hunt();
    }
}

//interface
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right ,diagonal(in all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right)");
    }
}
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right ,diagonal(by 1 step)");
    }
}

//multiple inheritance By using the interface
interface Carnivor{
void eat();
void hunt();
}
interface Herbivor{
    void eat();
    void graze();
}

class Bear implements Carnivor, Herbivor{
    public void eat() {
        System.out.println("Bear eats both plants and meat.");
    }

    public void hunt() {
        System.out.println("Bear hunts for food.");
    }

    public void graze() {
        System.out.println("Bear grazes on plants.");
    }
}