
import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
       int a=0,b=1,i,n;
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(a+"");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    
}
