package Day_7;
import java.util.*;
class AddElementQueueUsingLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front=null;
    Node rear=null;
    void enqueue(int data){
        Node ptr=new Node(data);
        if(front==null){
            front=rear=ptr;
            return;
        }
        else{
            rear.next=ptr;
            rear=ptr;
        }
    }
    void sum(){
        Node temp=front;
        int sum=0;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println("Sum of all elements in the queue is: "+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AddElementQueueUsingLinkedList q=new AddElementQueueUsingLinkedList();
        System.out.println("Enter the number of elements you want to add in the queue: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            q.enqueue(data);
        }
        q.sum();
    }
}