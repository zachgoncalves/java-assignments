
package msort;

import java.util.*;

public class MergeSortClient {

   public static void main(String[] args) {
      System.out.println("MERGE SORT:");
      System.out.println("*******************************");
      Random mgen=new Random(); 
      int[] marray=new int[10];
      int i; 
      for (i=0; i<marray.length; i++) {
          marray[i]=mgen.nextInt(5000)+1;
      }
      System.out.println("Initial array:");
      for (i=0; i<marray.length; i++) {
          System.out.println(marray[i] + " ");
      }
      System.out.println();
      MergeSort.mergesort(marray, 0, marray.length-1);
      System.out.println("Sorted array:");
      for (i=0; i<marray.length; i++) {
          System.out.println(marray[i] + " ");
      }
      System.out.println("Done!");
      System.out.println(" numcalls "+MergeSort.numcalls);
      System.out.println(" count "+MergeSort.count+" m "+MergeSort.m);
      
      
      
   }

    
}
