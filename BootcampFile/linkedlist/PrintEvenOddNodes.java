package linkedlist;
import java.util.*;
class PrintEvenOddNodes{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node insert(int data){
        Node ptr= new Node(data);
        ptr.next=head;
        head=ptr;
        return ptr;   
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PrintEvenOddNodes ll=new PrintEvenOddNodes();
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.print("Enter data: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.insert(data);
        }
           System.out.println("Even nodes followed by odd nodes: ");
            PrintEvenOddNodes.Node temp=ll.head;
            while(temp!=null){
                if(temp.data%2==0){
                    System.out.print(temp.data+" ");
                }
                temp=temp.next;
            }
            temp=ll.head;
            while(temp!=null){
                if(temp.data%2!=0){
                    System.out.print(temp.data+" ");
                }
                temp=temp.next;
            }
    }
}