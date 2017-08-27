package sortingBalls;

/**
 * Recursive implementation of the QuickSort algorithm
 * @author jerill
 *
 */
public class QuickSort {

 private static int partition(int arr[], int low, int high) {
     int pivot = arr[high];
     int i = (low-1);
     for (int j=low; j<=high-1; j++)
     {
         if (arr[j] <= pivot)
         {
             i++;

             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;

     return i+1;
 }

 public static void qSort(int arr[], int low, int high) {
     if (low < high)
     {
         int pi = partition(arr, low, high);

         qSort(arr, low, pi-1);
         qSort(arr, pi+1, high);
     }
 }
	
	
}
