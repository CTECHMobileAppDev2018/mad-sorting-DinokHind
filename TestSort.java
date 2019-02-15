import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TestSort
{
  
  // yes, I should have called the sorter class something other than "Main"
  
    // Test program 
    public static void main(String args[]) 
    { 
      System.out.println("How many items would you like in your array? Max 1,000,000: ");
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter username");
      
      String userName = myObj.nextLine();  // Read user input
      
      System.out.println("This will test your sorting with " + userName + " items between +/- 1000000");
      
      double arr[] = new double[Integer.parseInt(userName)];

      for (int i = 0; i < Integer.parseInt(userName); i++) {
        arr[i] = new Random().nextDouble() * 2000000 - 1000000;
      }
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