import java.util.*;
class StringPermutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("All the permutations of the string are:");
        //permute(str,"");
        permute(str.toCharArray(), 0);
    }
    /**public static void permute(String str, String result){
        if(str.length() == 0){
            System.out.println(result);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0,i) + str.substring(i+1);
            permute(ros, result + ch);
        }
    }**/
    public static void permute(char[] arr, int index){
        if(index == arr.length){
            System.out.println(String.valueOf(arr));
            return;
        }
        for(int i=index; i<arr.length; i++){
            swap(arr, index, i);
            permute(arr, index+1);
            swap(arr, index, i); // backtrack
        }
    }
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}