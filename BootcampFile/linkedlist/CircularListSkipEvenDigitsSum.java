package linkedlist;
import java.util.*;
class CircularListSkipEvenDigitsSum{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insert(int data){
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            ptr.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=ptr;
            ptr.next=head;
        }
    }
        
    public void display(){
        Node temp=head;
        do{
        int num=temp.data;
        int sum=0; 
        while(num>0){
            sum+=num%10;
            num=num/10;
        } 
        if(sum%2!=0){
            System.out.print(temp.data+" ");
        }
        temp=temp.next;
        }while(temp!=head);
    }
    public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            CircularListSkipEvenDigitsSum dll=new CircularListSkipEvenDigitsSum();
            System.out.println("Enter number of nodes: ");
            int n=sc.nextInt();
            System.out.println("Enter data: ");
            for(int i=0;i<n;i++){
                int data=sc.nextInt();
                dll.insert(data);
            }
            System.out.println("Circular list with no even digits: ");
            dll.display();
        
        }
}