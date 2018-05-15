
package inssort;

import java.util.Random;

public class InsertionSortClient {
    
    public static void main(String[] args) {
      int i;
      System.out.println("INSERTION SORT:");
      System.out.println("*******************************");
      Random igen=new Random(); 
      int[] insarray=new int[10];
      for (i=0; i<insarray.length; i++) {
          insarray[i]=igen.nextInt(5000)+1;
      }
      System.out.println("Initial array:");
      for (i=0; i<insarray.length; i++) {
          System.out.println(insarray[i] + " ");
      }
      System.out.println();
      InsertionSort.insertionSort(insarray);
      System.out.println("Sorted array:");
      for (i=0; i<insarray.length; i++) {
          System.out.println(insarray[i] + " ");
      }
      System.out.println("Done!");
      System.out.println("Insertion Sort Count: "+InsertionSort.icount);

    }
}
