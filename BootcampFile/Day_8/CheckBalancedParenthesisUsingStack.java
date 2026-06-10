package Day_8;
import java.util.*;
class CheckBalancedParenthesisUsingStack{
    public boolean isValid(String S){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char n=st.peek();
                st.pop();
                if(n=='(' && ch!=')'||n=='{' && ch!='}'||n=='[' && ch!=']'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      CheckBalancedParenthesisUsingStack bp=new CheckBalancedParenthesisUsingStack();
      System.out.print("Enter the number of test cases: ");
      int T=sc.nextInt();
      sc.nextLine();
      System.out.println("Enter Expression: ");
      for(int i=0;i<T;i++){
        String S=sc.nextLine();
        if(bp.isValid(S)){
            System.out.print("Balanced Parenthesis.");
        }
        else{
            System.out.print("Not Balanced.");
        }
      }
    }
}