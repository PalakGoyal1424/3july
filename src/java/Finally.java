
public class Finally {
     public static void main(String args[]){  
         
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){System.out.println(e);}
  finally{
       int a=10,b=12,c;
         c=a+b;
      System.out.println(c);
  }
  
      }  
  
  
  }  
  
  

