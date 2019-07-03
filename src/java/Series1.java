
import java.util.Scanner;


public class Series1 {
    public static void main(String[] args) {
        int N,sum=0;
        System.out.println("enter the no.");
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
       sum = ( N*((N/2)+((N%2)*2)+N ));
        System.out.println("Series   "+sum);
    }
}
