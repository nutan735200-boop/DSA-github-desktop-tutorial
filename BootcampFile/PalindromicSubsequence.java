import java.util.*;
public class PalindromicSubsequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1=sc.nextLine();
        String str2=new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed String: " + str2);
            int n=str1.length();
            int m=str2.length();
            int[][] dp=new int[n+1][m+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=m;j++){
                    if(i==0||j==0){
                    dp[i][j]=0;
                    }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            System.out.println("Length: " + dp[n][m]); 
            StringBuilder sb=new StringBuilder();
            int i=n,j=m;
            while(i>0&&j>0){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    sb.append(str1.charAt(i-1));
                    i--;
                    j--;
                }
                else if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }
                else{
                    j--;
                }
            }
            System.out.println("Palindromic Subsequence: " + sb.reverse().toString());
        }
     }

