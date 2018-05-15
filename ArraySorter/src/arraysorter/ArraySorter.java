
package arraysorter;

import java.util.Arrays;

/**
Class for sorting an array of base type int from smallest to largest.
 */
public class ArraySorter
{
	/**
    Precondition: Every element in anArray has a value.
    Action: Sorts the array into ascending order.
	 */
	public static void selectionSort(int[] anArray)
	{
		for (int index = 0; index < anArray.length - 1; index++)
		{   // Place the correct value in anArray[index]
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
			//Assertion:anArray[0] <= anArray[1] <=...<= anArray[index]
			//and these are the smallest of the original array elements.
			//The remaining positions contain the rest of the original
			//array elements.
		}
	}
	/**
    Returns the index of the smallest value in the portion of the
    array that begins at the element whose index is startIndex and
    ends at the last element.
	 */
	private static int getIndexOfSmallest(int startIndex, int[] a)
	{
		int min = a[startIndex];   
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++)
		{
			if (a[index] < min)
			{
				min = a[index];
				indexOfMin = index;
				//min is smallest of a[startIndex] through a[index]
			}
		}
		return indexOfMin;
	}
	/**
    Precondition: i and j are valid indices for the array a.
    Postcondition: Values of a[i] and a[j] have been interchanged.
	 */
	private static void interchange(int i, int j, int[] a)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; //original value of a[i]
	}
        
        public static void bubbleSort(int[] array2) {         
            int temp = 0; 
            for(int i = 0; i < array2.length - 1; i++) {
                if(array2[i] > array2[i + 1]) {
                   temp = array2[i];
                   array2[i] = array2[i + 1];
                   array2[i + 1] = temp;
                }
            }
        }
        
        public static void insertionSort(int[] array1){
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                int j;
                
                for (j = i - 1; j >= 0 && temp < array1[j]; j--) {
                    array1[j + 1] = array1[j]; 
                } 
                
                array1[j + 1] = temp;
            }
        }
       
        public static void main(String[] args) {
            int[] input1 = { 1, 3, 2, 4, 6, 5 };
            bubbleSort(input1);
            System.out.println("Bubble Sort: " +Arrays.toString(input1));

            int[] input2 = {1, 3, 5, 4, 2, 6 };
            insertionSort(input2);
            System.out.println("Insertion Sort: " + Arrays.toString(input2));

        }
}