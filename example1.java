package Practice_abstract;
abstract  class Pen{
     abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Hello i am Writing with fountain pen");
    }
    public void refill(){
        System.out.println("Hello i am Refilling fountain pen");

    }
    public void changeNib()
    {
        System.out.println("Hello i am changing nib of Fountain pen");
    }
}
public class example1 extends Pen{
    public void write(){
        System.out.println("Hello i am Writing");
    }
    public void refill(){
        System.out.println("Hello i am Refilling ");

    }
    public static void main(String[] args) {
       example1 obj=new example1();
       obj.write();
       obj.refill();
       FountainPen o1=new FountainPen();
       o1.changeNib();
    }
}
