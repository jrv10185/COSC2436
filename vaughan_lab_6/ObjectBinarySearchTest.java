package vaughan_lab_6;
import java.io.*;

public class ObjectBinarySearchTest {
   public static void main(String [] args) throws IOException
   {
      int result;
      String searchValue;
      String input;
      
      // An array of numbers to search.
      String names[] = {"James", "Tish", "Trent","Carrie","Paul","Ellen"};
      
      // Create the console input objects.
      InputStreamReader reader =
                 new InputStreamReader(System.in);
      BufferedReader keyboard =
                 new BufferedReader(reader);

      // System.out.println(names[0]+", "+names[1]+", "+names[2]+", "+names[3]+", "+names[4]+", "+names[5]);
      // First we must sort the array in ascending order.
      ObjectQuickSorter.quickSort(names);
      
      do
      {
         // Get a value to search for.
         System.out.print("Enter a name to search for: ");
         input = keyboard.readLine();
         searchValue = input;

         // Search for the value
         result = ObjectBinarySearcher.search(names, searchValue);

        // Display the results.
        if (result == -1)
           System.out.println(searchValue + " was not found.");
        else
        {
           System.out.println(searchValue + " was found at " +
                              "element " + result);
        }

        // Does the user want to search again?
        System.out.print("Do you want to search again? (Y or N): ");
        input = keyboard.readLine();
      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
   } 
}


 class ObjectBinarySearcher {
     /**
      The search method performs a binary search on an Comparable
      array. The array is searched for the number passed to
      value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the
      value was not found in the array.
      @param array The array to search.
      @param value The value to search for.
   */

   public static int search(Comparable[] array, Comparable value)
   {
      int lower = 0;
      int upper = array.length-1;

      while (lower <= upper){
        int middle = (lower +upper)/2;
        if(value.compareTo(array[middle]) == 0){
            return middle;
        }
        if(value.compareTo(array[middle]) < 0){
            upper = middle +1;
        } else {
            lower = middle +1;
        }
      }
      return -1;
   }   
}


 class ObjectQuickSorter {
   /**
      The quickSort method calls the doQuickSort method
      to sort an Compareable array.
      @param array The array to sort.
   */
   
   public static void quickSort(Comparable array[])
   {
      doQuickSort(array, 0, array.length - 1);
   }

   /**
      The doQuickSort method uses the QuickSort algorithm
      to sort an int array.
      @param array The array to sort.
      @param start The starting subscript of the list to sort
      @param end The ending subscript of the list to sort
   */
   
   private static void doQuickSort(Comparable array[], int start, int end)
   {
      int pivotPoint;
      
      if (start < end)
      {
         // Get the pivot point.
         pivotPoint = partition(array, start, end);
         
         // Sort the first sub list.
         doQuickSort(array, start, pivotPoint - 1);
         
         // Sort the second sub list.
         doQuickSort(array, pivotPoint + 1, end);
      }
   }

   /**
      The partiton method selects a pivot value in an array
      and arranges the array into two sub lists. All the
      values less than the pivot will be stored in the left
      sub list and all the values greater than or equal to
      the pivot will be stored in the right sub list.
      @param array The array to partition.
      @param start The starting subscript of the area to partition.
      @param end The ending subscript of the area to partition.
      @return The subscript of the pivot value.
   */
   
   private static int partition(Comparable [] array, int start, int end)
   {
      Comparable pivotValue;    // To hold the pivot value
      int endOfLeftList; // Last element in the left sub list.
      int mid;           // To hold the mid-point subscript

      // Find the subscript of the middle element.
      // This will be our pivot value.
      mid = (start + end) / 2;

      // Swap the middle element with the first element.
      // This moves the pivot value to the start of 
      // the list.
      swap(array, start, mid);

      // Save the pivot value for comparisons.
      pivotValue = array[start];
      
      // For now, the end of the left sub list is
      // the first element.
      endOfLeftList = start;
      
      // Scan the entire list and move any values that
      // are less than the pivot value to the left
      // sub list.
      for (int scan = start + 1; scan <= end; scan++)
      {
         if (pivotValue.compareTo(array[scan])>0)
         {
            endOfLeftList++;
            swap(array, endOfLeftList, scan);
         }
      }
      
      // Move the pivot value to end of the
      // left sub list.
      swap(array, start, endOfLeftList);
      
      // Return the subscript of the pivot value.
      return endOfLeftList;
   }

   /**
      The swap method swaps the contents of two elements
      in an int array.
      @param The array containing the two elements.
      @param a The subscript of the first element.
      @param b The subscript of the second element.
   */
   
   private static void swap(Comparable [] array, int a, int b)
   {
      Comparable temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   } 
}
