package linkedlist;
import java.util.*;
class CountOccurrencesLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int countOccurrences(int key){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==key){
                count++;
            }
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CountOccurrencesLinkedList ll=new CountOccurrencesLinkedList();
        System.out.print("Enter number of nodes: ");
        int n=sc.nextInt();
        System.out.print("Enter data: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            ll.insert(data);
        }
        System.out.print("Enter the key to search: ");
        int key=sc.nextInt();
        int result=ll.countOccurrences(key);
        System.out.println("Number of occurrences of " + key + " is: " + result);
    }
}