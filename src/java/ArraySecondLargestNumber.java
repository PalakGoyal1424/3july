
public class ArraySecondLargestNumber {
    public static void main(String[] args) {
        int array[]={4,2,6,1,8,9,10,17};
         int temp, size;

      size = array.length;
       int l=array[0];
       int s=array[0];
      for(int i = 1; i<size; i++ ){

          if(array[i]>l)
          {
              s=l;
              l=array[i];
          }
          else if(array[i]>s){
              s=array[i];
          }
      }
      System.out.println("Second largest number is:: "+s);
   }
}


