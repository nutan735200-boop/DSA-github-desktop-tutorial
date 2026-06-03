import java.util.*;
class StringRotationByPosition{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string: ");
            String str = sc.nextLine();
            System.out.println("Enter the position to rotate the string: ");
            int pos = sc.nextInt();
            System.out.println("Type of rotation: L for left rotation, R for right rotation");
            char type = sc.next().charAt(0);
            if(type == 'L' || type == 'l'){
                String rotatedString = leftRotate(str, pos);
                System.out.println("Left rotated string: " + rotatedString);
            } else if(type == 'R' || type == 'r'){
                String rotatedString = rightRotate(str, pos);
                System.out.println("Right rotated string: " + rotatedString);
            } else {
                System.out.println("Invalid rotation type. Please enter L or R.");
            }
        }
        public static String leftRotate(String str, int pos){
            pos = pos % str.length(); // Handle cases where pos is greater than string length
            return str.substring(pos) + str.substring(0, pos);
        }
        public static String rightRotate(String str, int pos){
            pos = pos % str.length(); // Handle cases where pos is greater than string length
            return str.substring(str.length() - pos) + str.substring(0, str.length() - pos);
        }
}
