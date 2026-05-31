import java.util.*;
class BalancedParentheses{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String str=sc.nextLine();
        if(isBalanced(str)){
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }
    
    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}