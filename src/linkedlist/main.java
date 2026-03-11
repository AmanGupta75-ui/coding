package linkedlist;
class Node{
    int data;
    Node next;
}

public class main {
     public static void main(String[] args) {
         Node n1=new Node();
         System.out.println(n1);
         n1.data=10;
         System.out.println(n1.next);
         Node n2=new Node();
         n1.next=n2;
         System.out.println(n2.data);

         n2.data=20;
         System.out.println(n2);
         System.out.println(n1.next);

         Node n3=new Node();
         n2.next=n3;
         System.out.println(n3.data);
         n3.data=30;
         System.out.println(n3);
         System.out.println(n2.data);
         System.out.println(n1.next.next);
         Node n4=new Node();
         n4.next=n3;
         System.out.println(n4.data);
         n4.data=20;
         System.out.println(n4);
 




    }
}
