import java.util.*;
class ReverseDoubleList{
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
      Node head;
      void insert(int data){
        Node temp;
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ptr;
        ptr.prev=temp;
      }
      void reverse(){
        Node temp=head;
        Node tail=null;
        while(temp!=null){
            tail=temp;
            temp=temp.next;
        }
        while(tail!=null){
            System.out.print(tail.data+" ");
            tail=tail.prev;
        }
      }
     public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         ReverseDoubleList dll=new ReverseDoubleList();
         System.out.println("Enter number of nodes: ");
         int n=sc.nextInt();
         System.out.println("Enter data: ");
         for(int i=0;i<n;i++){
           int data=sc.nextInt();
           dll.insert(data);
         }
         System.out.println("Reversed list: ");
         dll.reverse();
     } 
}