package Practice_abstract;
abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void jump()
    {
        System.out.println("Hello i am jumping");
    }
    void bite()
    {
        System.out.println("Hello i am biting");
    }

    @Override
    public void eat() {
        System.out.println("Hello i am Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Hello i am sleeping");
    }
}
public class example2 {
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.jump();
        obj1.bite();
        obj1.eat();
        obj1.sleep();
        //
        Monkey m1=new Human();
      //  m1.speak();//-->  cannot use speak method becoz the ref is monkey which doesnt have speak  method
        BasicAnimal l=new Human();
       // l.speak();// cannot work error
        l.eat();

    }
}
