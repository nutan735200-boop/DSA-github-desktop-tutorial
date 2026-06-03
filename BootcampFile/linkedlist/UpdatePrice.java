import java.util.*;
class UpdatePrice{
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
      Node head;
      void insert(int data){
        Node temp;
        Node ptr=new Node(data);
        if(head==null){
            head=ptr;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ptr;
        ptr.prev=temp;
      }
      void update(int index,int value){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(i==index){
                temp.data=value;
                return;
            }
            temp=temp.next;
            i++;
        }
    }
    void print(){
      Node temp=head;
      System.out.print("Updated Price: ");
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        UpdatePrice dll=new UpdatePrice();
        int n=sc.nextInt();
        System.out.print("Enter prices: ");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            dll.insert(data);
        }
        System.out.print("Enter index: ");
        int index=sc.nextInt();
        System.out.print("Enter price to be updated: ");
        int value=sc.nextInt();
        dll.update(index,value);
        dll.print();
        
    }

}