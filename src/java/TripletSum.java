import java.io.*; 
public class TripletSum {
    // A Simple Java program to  
// count triplets with sum  
// smaller than a given value 

  

static int printTriplets(int arr[],int n, int sum) 
{ 
   
    for (int i = 0; i < n - 2; i++) 
    { 
   
    for (int j = i + 1; j < n - 1; j++) 
    { 
      
        for (int k = j + 1; k < n; k++) 
            if (arr[i] + arr[j] + arr[k] < sum) 
                System.out.println(arr[i] + ", " +  arr[j] + ", " + arr[k]);  
                               
    } 
    } 
    return 0; 
}
public static void main (String[] args) 
{ 
    int arr[] = {5, 1, 3, 4, 7}; 
    int n = arr.length; 
    int sum = 12; 
    printTriplets(arr, n, sum); 
} 
} 
