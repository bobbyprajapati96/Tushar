package College_Que;

import java.util.ArrayDeque;
import java.util.Queue;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class Problem1 {

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        for(int i=1;i<=5;i++) {
            q.add(i * 10);
            System.out.println(q);
        }
        q.add(60);
        if(q.size()>5) {
            System.out.println("Cannot add element Queue Overflow");
        }
//        System.out.println("Adding one more element");q.add(70);
        for(int j=0;j<=5;j++)
        {
            q.remove();
        }
        if(q.size()==0)
            System.out.println("Queue Underflow");
        else
            System.out.println(q);

    }
}
