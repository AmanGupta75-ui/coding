package linkedlist;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;

    }
}

public class main {
    public static Node insertathead(Node head){
        if(head== null)return new Node(55);

        Node newHead=new Node(55);
        newHead.next=head;
        
        return newHead;
        
    }
    public static  Node insertatend(Node head){
        if(head==null)return null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node n= new Node(45);
        temp.next=n;
        return head;
    }



    public static Node removeKthPosition(Node head,int k)
    {
        if(head == null) return null;
        if(k==1) return head.next;
        int count =0;
        Node prev = null;
        Node temp = head;

        while(temp!=null)
        {   count++;
            if(count ==k)
            {
                prev.next = temp.next;
                break;
            }
            prev =temp;
            temp=temp.next;
        }
        return head;

    }
    public static Node insertatkposi(Node head, int k){


        if(head==null){
            if(k==1){
                Node n=new Node(99);
                return n;
            }else{
                return  null;
            }
        }
        if(k==1){
            Node n=new Node(99);
            n.next= head;
            return  n;
        }

        Node temp=head;
        int count= 0;
        while(temp!=head){
            count++;
             if(count==k-1){
                 Node n= new Node(99);
                 n.next= temp.next;
                 temp.next=n;
                 break;

             }
             temp= temp.next;
        }
        return head;
    }

    public static Node removeByValue(Node head,int value)
    {
        if(head == null) return null;
        if(value==1) return head.next;
        // int count =0;
        Node prev = null;
        Node temp = head;

        while(temp!=null)
        {
            if(temp.data ==value)
            {
                prev.next = temp.next;
                break;
            }
            prev =temp;
            temp=temp.next;
        }
        return head;

    }





    public static Node convertToLL(int [] arr) {
        int n = arr.length;
        Node n1 = new Node(arr[0]);
        Node head = n1;
        for (int i = 1; i < n; i++) {
            Node temp = new Node(arr[i]);
            n1.next = temp;
            n1 = temp;
        }
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print( " -> "+ temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int[] arr = {12,23,3,1,5,7,3};
        Node head = convertToLL(arr);
//        display(head);
//        System.out.println();


        //  int k = sc.nextInt();
//int value = sc.nextInt();
        // head = removeKthPosition(head,k);
//        head = removeByValue(head,value);
//        display(head);
//        head= insertathead(head);
//        display(head);
//
//        head=insertatend(head);
//        display(head);
        head=insertatkposi(head, k);
        display(head);

    }
}



