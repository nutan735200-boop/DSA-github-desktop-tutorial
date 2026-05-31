import java.util.*;
//import java.util.Arrays;
//import java.util.HashMap;
public class GroupAnagrams{
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
        Map<String,List<String>> anagramMap=new HashMap<>();
        for(String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);
            if(!anagramMap.containsKey(sortedStr)){
                anagramMap.put(sortedStr,new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        List<List<String>> result=new ArrayList<>(anagramMap.values());
        System.out.println("Grouped Anagrams:");
        for(List<String> group:result){
            System.out.println(group);
        }
    }
}
