
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter trhe number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

       for(int i=2;i<n;i++)
       {
          if(n%i==0)
      {
          count++;
          break;
      }
       }
      if(count==0){
          System.out.println(" Prime Number");
      }
      else{
          System.out.println("Not a prime number");
      }
    }
    }
 
 
