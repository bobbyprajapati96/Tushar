package OOPS_CONCEPT;
abstract class Animal{
    abstract public void walk();
    Animal(){
        System.out.println("I am in animal constructor");
    }
    public void eats(){
        System.out.println("eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("I am in horse constructor");
    }
    public void walk()
    {
        System.out.println("Horse has 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken has 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        Chicken c=new Chicken();
        c.walk();
        h.eats();
        c.eats();

    }
}
