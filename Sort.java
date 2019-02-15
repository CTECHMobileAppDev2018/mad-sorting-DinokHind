import java.util.Arrays;

class Main 
{ 

    // start and end are optional - some sorting algorithms use them, but you can ignore them
    void sort(double arr[], long start, long end) 
    { 
      // sort the array here
      for (int x = 0; x < (arr.length-1); x++){
        for (int i = 0; i < (arr.length-1)-x; i++){
          if (arr[i] > arr[i+1]){
            double temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
          }
        }
      }
    } 

  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
        System.out.println("original array: "); 
        System.out.println(Arrays.toString(arr));
        
        // create a sorted version to test.
        double sortedArr[] = arr.clone();
        Arrays.sort(sortedArr);
        System.out.println("sorted array: "); 
        System.out.println(Arrays.toString(sortedArr));
        
       
        Main sorter = new Main(); // create a sorter object
        sorter.sort(arr, 0, arr.length); // call the sort function
  
        System.out.println("*** your sorted array: "); 
        System.out.println(Arrays.toString(arr));
    } 
} 
