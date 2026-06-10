package Day_8;
import java.util.*;
class RearrangeElementPartitionQueue{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            q.offer(sc.nextInt());
        }
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i=0;i<T/2;i++){
            firstHalf.offer(q.poll());
        }
        while (!firstHalf.isEmpty()) {
            System.out.print(firstHalf.poll() + " ");
            System.out.print(q.poll() + " ");
        }

    }
}