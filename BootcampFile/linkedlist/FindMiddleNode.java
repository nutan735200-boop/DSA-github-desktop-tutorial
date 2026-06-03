import java.util.*;
class FindMiddleNode{
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
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=ptr;
        }
    }
    void findMiddle(){
        Node slow=head;
        Node fast=null;
        if(head!=null){
            fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println("Middle node: " + slow.data);
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        FindMiddleNode dll=new FindMiddleNode();
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter data: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            dll.insert(data);
        }
        dll.findMiddle();
    }
}