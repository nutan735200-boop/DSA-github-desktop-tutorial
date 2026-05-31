import java.util.*;
class StringCompression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            int count = 1;
            while(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            if(count > 1){
                System.out.print(count);
            }
        }
    }
}