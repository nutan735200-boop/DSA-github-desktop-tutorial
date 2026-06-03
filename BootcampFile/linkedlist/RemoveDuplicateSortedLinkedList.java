import java.util.*;
class RemoveDuplicateSortedLinkedList{
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
    void removeDuplicate(){
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        RemoveDuplicateSortedLinkedList dll=new RemoveDuplicateSortedLinkedList();
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.print("Enter data: ");
        for(int i=0;i<n;i++){
          int data=sc.nextInt();
          dll.insert(data);
        }
        System.out.println("List after removing duplicates: ");
        dll.removeDuplicate();
        dll.display();
        sc.close();
    }
}