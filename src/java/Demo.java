
import java.util.Scanner;
import java.util.TreeSet;


public class Demo {
    public static void main(String[] args) {
       // TreeSet<String>t=new TreeSet<String>();
                
        System.out.println("Enter the size");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      System.out.println("Name    SurName     Contact No.     RollNo");
        for(int i=0;i<n;i++)
        {
          String[] name=new String[n];
          String[] surname=new String[n];
          int[] contact=new int[n];
          int[] rollno=new int[n];
          
          
            /*int len,n1;
       // System.out.print("Name       ");
        Scanner sc1=new Scanner(System.in);
        String str=sc1.nextLine();
            t.add(str);
           String strArray[] = str.split(" ");
               //System.out.println(strArray[i]);   
            for(int j=0; j < strArray.length; j++){
		//  if(str==strArray[j]){
                //             System.out.println();}	 
		//}
      */
          
       // System.out.print("Sur Name       ");
       for(int j=0;j<n;j++){
        Scanner sc1=new Scanner(System.in);
        name[j]=sc1.next();
        surname[j]=sc1.next();
        contact[j]=sc1.nextInt();
       rollno[j]=sc1.nextInt();
       }
           }
    
       // System.out.println(  "val="+t.toString());
}
} 