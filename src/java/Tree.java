
import java.util.TreeSet;


public class Tree {
    public static void main(String[] args) {
        TreeSet<Integer>it=new TreeSet<Integer>();
        
        int arr[]={20,30,30,34,44,20,34,12,20};
        int i,j;
        
        System.out.println("Duplicate variable"); 
        //System.out.println(arr[2]);
        for(i=0;i<arr.length;i++)
        {
           // System.out.println(""+arr[i]);
            
        for(j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
            {
                System.out.println(arr[i]);
                it.add(arr[i]);
            }
           
        }
       
        } 
      System.out.println("Tree"+it.toString());
    }
}
