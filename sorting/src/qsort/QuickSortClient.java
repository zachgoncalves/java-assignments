
package qsort;

import java.util.Random;

public class QuickSortClient {
   
    public static void main(String[] args) {
      int i;
      System.out.println("QUICK SORT:");
      System.out.println("*******************************");
      Random qgen=new Random(); 
      int[] iarray=new int[10];
      for (i=0; i<iarray.length; i++) {
          iarray[i]=qgen.nextInt(5000)+1;
      }
      System.out.println("Initial array:");
      for (i=0; i<iarray.length; i++) {
          System.out.println(iarray[i] + " ");
      }
      System.out.println();
      QuickSort.quicksort(iarray, 0, iarray.length-1);
      System.out.println("Sorted array:");
      for (i=0; i<iarray.length; i++) {
          System.out.println(iarray[i] + " ");
      }
      System.out.println("Done!");
      System.out.println("QuickSort Count: "+QuickSort.qcount);
      
    }
    
}
