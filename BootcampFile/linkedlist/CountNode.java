import java.util.*;
class CountNode{
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
    void display(){
        Node temp=head;
        int count=0;
        while(temp!=null){
          count++;
          temp=temp.next;
        }
        System.out.println("Number of nodes: " + count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CountNode dll=new CountNode();
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.print("Enter data: ");
        for(int i=0;i<n;i++){
          int data=sc.nextInt();
          dll.insert(data);
          if(data==-1){
            break;
          }
        }
        dll.display();
    }
}