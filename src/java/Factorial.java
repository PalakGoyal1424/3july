
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        int m=1;
        System.out.println("enter number");
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>1;i--)
        {
            
            m=m*i;

        }
        System.out.println("no is"+m);
    }
}
