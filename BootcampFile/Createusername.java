import java.util.*;
class Createusername{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String fullname=sc.nextLine();
        System.out.println("Enter a student ID: ");
        String studentID=sc.nextLine();
        String name[]=fullname.trim().split("\\s+");
        String username=name[0]+"_"+name[name.length-1];
        System.out.println(username.toLowerCase()+studentID) ;
        
    }
}