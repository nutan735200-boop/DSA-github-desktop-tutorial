import java.util.*;
class LongestCommonPrefix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n=sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String[] strs=new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0)
                prefix=prefix.substring(0,prefix.length()-1);
        }
        System.out.println("The longest common prefix is: " + prefix);
    }
}
