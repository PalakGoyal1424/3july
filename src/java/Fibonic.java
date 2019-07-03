
import java.util.Scanner;


public class Fibonic {
     public static void main(String[] args) {
       int a=0,b=1,i,n,sum=0;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         System.out.println(a);
         System.out.println(b);
          for(i=1;i<=n-2;i++){
              sum=a+b;
          System.out.println(sum);
          a=b;
          b=sum;
          }
         
}
}