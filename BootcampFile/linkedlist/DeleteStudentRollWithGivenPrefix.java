package linkedlist;
import java.util.*;
class DeleteStudentRollWithGivenPrefix{
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
            ptr.next=head;
            head=ptr;
        }
    }
    void deleteWithPrefix(int prefix){
        Node temp=head;
        while(temp!=null && temp.data/100==prefix){
            head=temp.next;
            temp=head;
        }
        while(temp!=null && temp.next!=null){
            if(temp.next.data/100==prefix){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        temp=head;
        while(temp!=null){
            System.out.println("Roll: "+temp.data);
            temp=temp.next;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        DeleteStudentRollWithGivenPrefix dll=new DeleteStudentRollWithGivenPrefix();
        System.out.println("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter data: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            dll.insert(data);
        }
            System.out.println("Enter prefix to delete: ");
            int prefix=sc.nextInt();
            dll.deleteWithPrefix(prefix);
    }
}