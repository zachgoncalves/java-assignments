
package table;

import qsort.QuickSort;
import msort.MergeSort;
import inssort.InsertionSort;
import java.util.*;

public class Table {
    private static int k;
    
    public static void main(String[] args) {   
        runsToDo();
        mergeSortTable();
        quickSortTable();
        insertionSortTable();
    }
    
    public static int runsToDo() {
        System.out.println("Enter a positive number of runs you wish to complete:");
        Scanner userInput = new Scanner(System.in);
        k = userInput.nextInt();
        if(k < 0) {
            System.out.println("Try Again: Enter a positive number.");
            k = userInput.nextInt();
        }
        return k;
    }
    
    public static void mergeSortTable() {
        int testOne = 2048, testTwo = 4096, testThree = 8192, testFour = 16384;
        int[] testOneArray = new int[k];
        int[] testTwoArray = new int[k];
        int[] testThreeArray = new int[k];
        int[] testFourArray = new int[k];
        
        for(int i = 0; i < k; i++) {
            testOneArray[i] = mergeSorter(testOne);
            testTwoArray[i] = mergeSorter(testTwo);
            testThreeArray[i] = mergeSorter(testThree);
            testFourArray[i] = mergeSorter(testFour);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Merge Sort Table:");
        System.out.println("           Min:   Max:    Avg:");
        System.out.println("2048:     " + " " + getMin(testOneArray) + " " + getMax(testOneArray) + " " + getAvg(testOneArray));
        System.out.println("4096:     " + " " + getMin(testTwoArray) + " " + getMax(testTwoArray) + " " + getAvg(testTwoArray));
        System.out.println("8192:     " + " " + getMin(testThreeArray) + " " + getMax(testThreeArray) + " " + getAvg(testThreeArray));
        System.out.println("16384:    " + " " + getMin(testFourArray) + " " + getMax(testFourArray) + " " + getAvg(testFourArray));
    }
    
    public static void quickSortTable() {
        int testOne = 2048, testTwo = 4096, testThree = 8192, testFour = 16384;
        int[] testOneArray = new int[k];
        int[] testTwoArray = new int[k];
        int[] testThreeArray = new int[k];
        int[] testFourArray = new int[k];
        
        for(int i = 0; i < k; i++) {
            testOneArray[i] = quickSorter(testOne);
            testTwoArray[i] = quickSorter(testTwo);
            testThreeArray[i] = quickSorter(testThree);
            testFourArray[i] = quickSorter(testFour);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Quick Sort Table:");
        System.out.println("           Min:   Max:    Avg:");
        System.out.println("2048:     " + " " + getMin(testOneArray) + " " + getMax(testOneArray) + " " + getAvg(testOneArray));
        System.out.println("4096:     " + " " + getMin(testTwoArray) + " " + getMax(testTwoArray) + " " + getAvg(testTwoArray));
        System.out.println("8192:     " + " " + getMin(testThreeArray) + " " + getMax(testThreeArray) + " " + getAvg(testThreeArray));
        System.out.println("16384:    " + " " + getMin(testFourArray) + " " + getMax(testFourArray) + " " + getAvg(testFourArray));
    }
    
    public static void insertionSortTable() {
        int testOne = 2048, testTwo = 4096, testThree = 8192, testFour = 16384;
        int[] testOneArray = new int[k];
        int[] testTwoArray = new int[k];
        int[] testThreeArray = new int[k];
        int[] testFourArray = new int[k];
        
        for(int i = 0; i < k; i++) {
            testOneArray[i] = insertionSorter(testOne);
            testTwoArray[i] = insertionSorter(testTwo);
            testThreeArray[i] = insertionSorter(testThree);
            testFourArray[i] = insertionSorter(testFour);
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("Insertion Sort Table:");
        System.out.println("           Min:   Max:    Avg:");
        System.out.println("2048:     " + " " + getMin(testOneArray) + " " + getMax(testOneArray) + " " + getAvg(testOneArray));
        System.out.println("4096:     " + " " + getMin(testTwoArray) + " " + getMax(testTwoArray) + " " + getAvg(testTwoArray));
        System.out.println("8192:     " + " " + getMin(testThreeArray) + " " + getMax(testThreeArray) + " " + getAvg(testThreeArray));
        System.out.println("16384:    " + " " + getMin(testFourArray) + " " + getMax(testFourArray) + " " + getAvg(testFourArray));
    }
    
    public static int mergeSorter(int i) {
        MergeSort.m = 0;
        Random mgen=new Random();    
        int[] array = new int[i];
        for (int j=0; j<array.length; j++) {
            array[j]=mgen.nextInt(5000)+1;
        }
        MergeSort.mergesort(array, 0, array.length-1);
        return MergeSort.m;
    }
    
    public static int quickSorter(int i) {
        QuickSort.qcount = 0;
        Random mgen=new Random();    
        int[] array = new int[i];
        for (int j=0; j<array.length; j++) {
            array[j]=mgen.nextInt(5000)+1;
        }
        QuickSort.quicksort(array, 0, array.length-1);
        return QuickSort.qcount;
    }
    
    public static int insertionSorter(int i) {
        InsertionSort.icount = 0;
        Random mgen=new Random();    
        int[] array = new int[i];
        for (int j=0; j<array.length; j++) {
            array[j]=mgen.nextInt(5000)+1;
        }
        InsertionSort.insertionSort(array);
        return InsertionSort.icount;
    }

    public static int getMin(int[] arrayInput) {
        int min = arrayInput[0];
        for(int i = 0; i < arrayInput.length; i++) {
            if(arrayInput[i] < min) {
                min = arrayInput[i];
            }
        }
        return min;
    }
    
    public static int getMax(int[] arrayInput) {
        int max = arrayInput[0];
        for(int i = 0; i < arrayInput.length; i++) {
            if(arrayInput[i] > max) {
                max = arrayInput[i];
            }
        }
        return max;
    }
    
    public static double getAvg(int[] arrayInput) {
        double avg = 0;
        for(int i = 0; i < arrayInput.length; i++) {
            avg += arrayInput[i];
        }
        avg = (avg / arrayInput.length);
        return avg;
    }
}
