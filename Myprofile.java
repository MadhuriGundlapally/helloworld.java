import java.util.*;
import java.util.Scanner;
public class Myprofile {
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("enter your name :" );
       String name = sc.nextLine();

       System.out.println("enter your branch :");
        String branch = sc.nextLine();

        System.out.print("Enter your passed-out year: ");
        int year = sc.nextInt();
        sc.nextLine();

       System.out.println("enter your skills :");
       String skills = sc.nextLine();
        
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Passed-out Year: " + year);
        System.out.println("Skills: " + skills);

        sc.close();
     
   
    }
    
}
