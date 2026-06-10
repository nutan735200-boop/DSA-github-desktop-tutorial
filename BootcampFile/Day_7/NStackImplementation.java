package Day_7;
import java.util.*;
class NStackImplementation{
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    node top[]=new node[100];
    void nstack(int n){
        for(int i=0;i<n;i++){
            top[i]=null;
        }
    }
    void push(int base,int data){
        node ptr=new node(data);
        ptr.next=top[base];
        top[base]=ptr;
        System.out.println(data +" pushed into stack "+ base);
    }
    void pop(int base){
        if(top[base]==null){
            System.out.println("Stack Underflow.");
            return;
        }
        node temp=top[base];
        int value=temp.data;
        System.out.println("Deleted element from index no. "+ base +" is "+ value);
        top[base]=temp.next;
    }
    void display(int base){
        if(top[base]==null){
            System.out.println("Stack Underflow.");
            return;
        }
        node temp=top[base];
        System.out.print("Stack "+base+" :");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayAll(int n) {
    for (int i = 0; i < n; i++) {
        System.out.print("Stack " + i + ": ");
        node temp = top[i];
        if (temp == null) {
            System.out.println("Empty");
            continue;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NStackImplementation s=new NStackImplementation();
        System.out.println("Enter number of stacks: ");
        int n=sc.nextInt();
        s.nstack(n);
        while(true){
            System.out.println("Enter 1 to push, 2 to pop, 3 to display, 4 to display All, 5 to exit:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter stack number (0-" + (n - 1) + "): ");
                    int base=sc.nextInt();
                    System.out.print("Enter value:");
                    int data=sc.nextInt();
                    s.push(base,data);
                    break;
                case 2:
                    System.out.println("Enter stack number: ");
                    base=sc.nextInt();
                    s.pop(base);
                    break;
                case 3:
                    System.out.print("Enter stack number: ");
                    base=sc.nextInt();
                    s.display(base);
                    break;
                case 4:
                     s.displayAll(n);
                     break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}