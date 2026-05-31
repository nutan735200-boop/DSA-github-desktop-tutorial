import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        int l=0;
        int r=str.length()-1;
        boolean isPalindrome=true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                isPalindrome=false;
                break;
            }
            l++;
            r--;
        }
        if(isPalindrome){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }

    }
}