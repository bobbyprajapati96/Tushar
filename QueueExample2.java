package College_Que;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();
        // based on fifo -> first in first out
        // if queue is full then it will be called overflow condition
        //if queue is empty then it is called underflow condition
        //add(ele); // add at rear end
        //remove() return the front element
        //peek() return the front element
        //size() return size of the Queue
        q.add(10);
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.add(20);
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.add(30);
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.add(40);
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.remove();
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.remove();
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.remove();
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
        q.remove();
        System.out.println(q+" ->"+q.peek()+" size ->"+q.size());
    }
}
