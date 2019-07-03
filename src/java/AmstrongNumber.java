
import java.util.Scanner;


public class AmstrongNumber {
    public static void main(String[] args) {
        int a,b,c,i,sum=0;
        int n,temp;
       
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         temp=n;
        
         while(n>0)
         {
             a=n%10;
             n=n/10;
             sum=sum+ (a*a*a);
             
         }
         if(temp==sum){
         System.out.println("Amstrong Number");
    }
    else
             System.out.println("not a amstrong number");
}
}