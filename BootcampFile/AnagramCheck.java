import java.util.*;
class AnagramCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("The strings are not anagrams.");
            return;
        }
        /*Arrays.sort(str1.toCharArray());
         Arrays.sort(str2.toCharArray());
        if(str1.equals(str2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }*/
        int frequency[]=new int[256];
        for(int i=0;i<str1.length();i++){
            frequency[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            frequency[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(frequency[i]!=0){
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        System.out.println("The strings are anagrams.");
    }
}