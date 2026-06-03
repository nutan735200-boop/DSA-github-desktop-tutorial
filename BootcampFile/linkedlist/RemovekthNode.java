package linkedlist;
import java.util.*;
class RemovekthNode{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    void insert(int data){
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ptr;
    }
    void removeKthNode(int k){
        if(head==null){
            return;
        }
        if(k==1){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<k-1;i++){
            if(temp.next==null){
                return;
            }
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        RemovekthNode ll=new RemovekthNode();
        System.out.print("Enter the number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter the node values:");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.insert(data);
        }
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        ll.removeKthNode(k);
        ll.display();
    }

}