import java.util.Scanner;
class ReplacePattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Enter the pattern to replace: ");
        String pattern=sc.nextLine();
        System.out.println("Enter the replacement string: ");
        String replacement=sc.nextLine();
        String result=str.replace(pattern, replacement);
        System.out.println("Result: "+result);
    }
}