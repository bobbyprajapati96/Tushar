package LL;

public class Link1 {
    Node head;
    private int size;
    Link1()
    {
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
   //add -first, last
    public void addFirst(String data)
    {
        Node newnode=new Node(data);
         if(head==null)
        {
         head=newnode;
         return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addLast(String data)
    {
        Node newnode=new Node(data);
         if(head==null)
        {
         head=newnode;
         return;
        }
        Node currNode=head;
         while(currNode.next!=null){
             currNode=currNode.next;
         }
         currNode.next=newnode;
    }

    public void printlist()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head==null)
            System.out.println("The list is empty");
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null)
            System.out.println("The list is empty");
        Node secLast=head;
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }

    public int getSize()
    {
        return size;
    }

    public void reverse()
    {
        if(head==null || head.next==null)
          return;

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

//    <------------------------------------------------->
    public static void main(String[] args) {
        Link1 list=new Link1();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();

        list.deleteFirst();
        list.printlist();
list.deleteLast();
        list.printlist();

        System.out.println(list.getSize());
        list.reverse();
        list.printlist();
    }
}
