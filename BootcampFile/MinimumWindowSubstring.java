import java.util.*;
class MinimumWindowSubstring{
    public static String minWindow(String s, String p){
        int[] freq=new int[256];
        for(char c:p.toCharArray()){
            freq[c]++;
        }
        int count=p.length();
        int start=0, end=0, Start=0, minLen=Integer.MAX_VALUE;
        while(end<s.length()){
            if(freq[s.charAt(end)]>0){
                count--;
            }
            freq[s.charAt(end)]--;
            end++;
            while(count==0){
                if(end-start<minLen){
                    minLen=end-start;
                    Start=start;
                }
                freq[s.charAt(start)]++;
                if(freq[s.charAt(start)]>0){
                    count++;
                }
                start++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(Start, Start+minLen);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the pattern:");
        String p = sc.nextLine();
        String ans = minWindow(s, p);
        System.out.println("The minimum window substring is: " + ans);
    }
}
