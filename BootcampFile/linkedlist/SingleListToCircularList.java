import java.util.*;
class SingleListToCircularList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insert(int data){
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            ptr.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=ptr;
            ptr.next=head;
        }
    }
        public void display(){
            if(head==null){
                System.out.println("List is empty");
            }
            else{
                Node temp=head;
                do{
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }while(temp!=head);
                System.out.println();
            }
        }
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
            SingleListToCircularList dll=new SingleListToCircularList();
            System.out.println("Enter number of nodes: ");
            int n=sc.nextInt();
            System.out.println("Enter data: ");
            for(int i=0;i<n;i++){
                int data=sc.nextInt();
                dll.insert(data);
            }
            System.out.println("Circular list: ");
            dll.display();
        }
}