package OOPS_CONCEPT;
interface Animal1{
    int eye=12; //all fields in interface are static final by default
   public void walk(); //by default all methods in interface are public and abstract
}
class Horse1 implements Animal1{
    public void walk(){
        System.out.println("Horse is active");
    }
}
public class Abstraction_Interface {
    public static void main(String[] args) {
        Horse1 h=new Horse1();
        h.walk();
    }
}
