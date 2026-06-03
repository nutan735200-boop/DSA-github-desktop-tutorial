package linkedlist;
import java.util.*;
class DetectLoopLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    boolean detectLoop(){
        Node slow=head;
        Node fast=null;
        if(head!=null){
            fast=head.next;
        }
        while(slow!=null && fast!=null && fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;

        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DetectLoopLinkedList ll=new DetectLoopLinkedList();
        System.out.print("Enter the number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter the node values: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.insert(data);
        }
        boolean hasLoop = ll.detectLoop();
        if(hasLoop){
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}