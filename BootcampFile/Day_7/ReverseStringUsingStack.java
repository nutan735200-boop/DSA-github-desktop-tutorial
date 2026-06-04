package Day_7;
import java.util.*;
class ReverseStringUsingStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch!=' '){
                stack.push(ch);
            }
            else{
                while(!stack.isEmpty()){
                 System.out.print(stack.pop());
                }
                System.out.print(" ");
             }
        }
            
        while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
    }
}