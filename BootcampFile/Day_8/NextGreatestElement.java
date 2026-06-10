package Day_8;
import java.util.*;
class NextGreatestElement{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Stack<Integer> st=new Stack<>();
       System.out.println("Enter number of element: ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Elements are: ");
       for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
       }
       int result[]=new int[n];
       for(int i=n-1;i>=0;i--){
          while(!st.isEmpty() && st.peek()<=arr[i]){
            st.pop();
          }
          if(st.isEmpty()){
            result[i]=-1;
          }
          else{
            result[i]=st.peek();
          }
          st.push(arr[i]);
        }
        System.out.println("Next Greatest Elements: ");
        for(int i=0;i<n;i++){
           System.out.print(result[i]+" ");
        }

    }
}