import java.util.*;
class LongestSubstringWithoutRepeatingCharacters {
    public static void longestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int maxLen = 0;
        int start = 0;
        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                if (j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                }
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println("Length: " + maxLen);
        System.out.println("Longest Substring: " + s.substring(start, start + maxLen));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        longestSubstring(s);
    }
}
