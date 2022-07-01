package Practice_abstract;
abstract class Telephone{
    abstract void ring();
    abstract void  pick();
    abstract void disconnect();
}
 class Smartphone extends Telephone{
   void ring(){
       System.out.println("Hello i am ringing");
   }
     void pick(){
         System.out.println("Hello i am picking up the telephone");
     }
     void disconnect(){
         System.out.println("Hello i am disconnecting the telephone");
     }
}
public class example3 {
    public static void main(String[] args) {
        Telephone t=new Smartphone();
        t.ring();
        t.pick();
        t.disconnect();
    }
}
