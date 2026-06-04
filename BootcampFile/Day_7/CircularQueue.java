package Day_7;
import java.util.*;
class CircularQueue{
    private int[] cq;
    private int front,rear,capacity;
    public CircularQueue(int capacity){
        this.capacity=capacity;
        cq=new int[capacity];
        front=-1;
        rear=-1;
    }
    void enqueue(int data){
        if((rear + 1) % capacity == front){
            System.out.println("Queue is Full.");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%capacity;
        cq[rear]=data;
        System.out.println("Added element: "+data);
    }
    void dequeue(){
        if(front==-1){
            System.out.println("Queue is Empty.");
            return;
        }
        int num=cq[front];
        System.out.println("Deleted element: "+num);
        if(front == rear){
             front = rear = -1;
           }
          else{
               front = (front + 1) % capacity;
           }
    }
    void display(){
    if(front==-1){
        System.out.println("Queue is Empty.");
        return;
    }
    for(int i=front;i<=rear;i++){
        if(cq[i]==-1){
            break;
        }
         System.out.println("Elements are: "+cq[i]+" ");
         front=(front+1)%capacity;
    }
   }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CircularQueue q=new CircularQueue(5);
        while(true){
            System.out.print("Enter 1 to enqueue, 2 to dequeue, 3 to display, 4 to exit:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter element: ");
                    int data=sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
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


