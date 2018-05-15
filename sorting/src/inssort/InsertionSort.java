package inssort;


public class InsertionSort {
    
    public static int icount = 0;
    
    public static void insertionSort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int temp = input[i];
            int j;
                
            // Set j to value under I, then compare j with i if j is >=0
            for (j = i - 1; j >= 0 && temp < input[j]; j--) { 
                input[j + 1] = input[j]; 
                icount++;
            } 
                
            input[j + 1] = temp;
        }
    }
    
}
