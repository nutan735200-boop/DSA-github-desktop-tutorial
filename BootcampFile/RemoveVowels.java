import java.util.*;
class RemoveVowels{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a String: ");
            String str=sc.nextLine();
            String result=str.replaceAll("[AEIOUaeiou]", "");
            System.out.println("String after removing vowels: "+result);
    }
}