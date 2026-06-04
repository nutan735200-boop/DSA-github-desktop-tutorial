package linkedlist;
import java.util.*;
class RemoveDuplicatesfromDoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
      Node head;
      void insertAtBegin(int data){
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            return;
        }
        ptr.next=head;
        head.prev=ptr;
        head=ptr;
      }
      void removeDuplicates(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                Node dup=temp.next;
                temp.next=dup.next;
                if(dup.next!=null){
                    temp.next.prev=temp;
                }
            }
            else{
                temp=temp.next;
            }
        }     
     }
     void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
      
     public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         RemoveDuplicatesfromDoubleLinkedList dll=new RemoveDuplicatesfromDoubleLinkedList();
         System.out.println("Enter number of nodes: ");
         int n=sc.nextInt();
         System.out.println("Enter data: ");
         for(int i=0;i<n;i++){
           int data=sc.nextInt();
           dll.insertAtBegin(data);
         }
         System.out.println("List with duplicates removed: ");
         dll.removeDuplicates();
         dll.display();
     } 
}