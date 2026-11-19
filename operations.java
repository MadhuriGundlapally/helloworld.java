import java.util.*;
import java.util.Scanner;
public class operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number1");
        int a = sc.nextInt();

        System.out.println("enter the number2" );
        int b = sc.nextInt();

        System.out.println("add :" + (a+b) );
        System.out.println("sub:" + (a-b));
        System.out.println("mul :" + (a*b));
         
        if (b!= 0){
        System.out.println("div :" + (a / b));
           System.out.println("mod : "  + (a % b));
            }else{
           System.out.println("can't div");
              System.out.println("can't get the percentage");
            }
    
        sc.close();
    }
    
}
