package linkedlist;
import java.util.*;
class LinkedListPalindrome{
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
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=ptr;
        }
    }
    
    boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node current=slow;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args){
        LinkedListPalindrome ll=new LinkedListPalindrome();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the linked list:");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.insert(data);
        }
        if(ll.isPalindrome()){
            System.out.println("The linked list is a palindrome.");
        }else{
            System.out.println("The linked list is not a palindrome.");
        }
    }
}