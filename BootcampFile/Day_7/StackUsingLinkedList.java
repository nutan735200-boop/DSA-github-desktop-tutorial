package Day_7;
import java.util.*;
class StackUsingLinkedList{
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    void push(char data){
        Node ptr=new Node(data);
        ptr.next=top;
        top=ptr;
        System.out.println("Adding Section: "+data);   
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        else{
            System.out.println("Removing Section: "+top.data);
            top=top.next;
        }
    }
    void display(){
        if(top==null){
            System.out.println("Stack is empty.");
            return;
        }
        else{
            System.out.println("Enrolled Section: ");
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StackUsingLinkedList s=new StackUsingLinkedList();
        while(true){
            System.out.println("Enter 1 to push, 2 to pop, 3 to display, 4 to exit:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter section to enroll:");
                    char data=sc.next().charAt(0);
                    s.push(data);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
           }
       }
   }
}