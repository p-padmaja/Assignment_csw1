
public class A5Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1, 2, 3, 4, 5};   
	     int n = 2;   
	     System.out.println("Original array: ");    
	     for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
	     for(int i = 0; i < n; i++) {    
	    	 int j, last;  
	         last = arr[arr.length-1];    
	         for(j = arr.length-1; j > 0; j--) arr[j] = arr[j-1];
	         arr[0] = last;
	     }
	     System.out.println(); 
	     System.out.println("Array after right rotation: ");    
	     for(int i = 0; i< arr.length; i++) {    
	    	 System.out.print(arr[i] + " ");   
	     }   
	}

}
//import java.io.*;
//
//class A5Q16 {
//   
//   
//// Function to rotate array
//static void Rotate(int arr[], int d, int n)
//{
//    // Storing rotated version of array
//    int temp[] = new int[n];
// 
//    // Keeping track of the current index
//    // of temp[]
//    int k = 0;
// 
//    // Storing the n - d elements of
//    // array arr[] to the front of temp[]
//    for (int i = d; i < n; i++) {
//        temp[k] = arr[i];
//        k++;
//    }
// 
//    // Storing the first d elements of array arr[]
//    //  into temp
//    for (int i = 0; i < d; i++) {
//        temp[k] = arr[i];
//        k++;
//    }
// 
//    // Copying the elements of temp[] in arr[]
//    // to get the final rotated array
//    for (int i = 0; i < n; i++) {
//        arr[i] = temp[i];
//    }
//}
// 
//// Function to print elements of array
//static void PrintTheArray(int arr[], int n)
//{
//    for (int i = 0; i < n; i++) {
//        System.out.print(arr[i]+" ");
//    }
//}
//    public static void main (String[] args) {
//        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//        int N = arr.length;
//        int d = 2;
// 
//        // Function calling
//        Rotate(arr, d, N);
//        PrintTheArray(arr, N);
//    }
//}
//
//Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.
//
//First Step:
//    => Store the elements from 2nd index to the last.
//    => temp[] = [3, 4, 5, 6, 7]
//
//Second Step: 
//    => Now store the first 2 elements into the temp[] array.
//    => temp[] = [3, 4, 5, 6, 7, 1, 2]
//
//Third Steps:
//    => Copy the elements of the temp[] array into the original array.
//    => arr[] = temp[] So arr[] = [3, 4, 5, 6, 7, 1, 2]