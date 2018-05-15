package intcoll1;

import java.util.*;

public class Intcoll1
{
   // Create a private array of integers named c
   private int[] c;

    //Makes the Collection empty and ensures it has capacity for 500 integers. 
   public Intcoll1() {
      	c = new int[500+1];
      	c[0] = 0;
   }
   
   // Set an input parameter for the default constructor
   public Intcoll1(int i) {
      	c = new int[i+1];
    	c[0] = 0;
   }

   /* Check if the arrays are different, if they are then create a new array and transfer the values on the array 
    * to the c array in obj. Then set the last value of the new array to 0. 
    */
   public void copy(Intcoll1 obj) {
      	if (this != obj) {
		c = new int[obj.c.length];
		int j = 0;
		while (obj.c[j] != 0) {
                    c[j] = obj.c[j]; 
                    j++;
		}
		c[j] = 0;
	}
   }

   // Returns true if I is in the collection and false otherwise
   public boolean belongs(int i) {
      	int j = 0;
      	while ((c[j] != 0) && (c[j] != i)) j++;
      	return ((i>0)&&(c[j] == i));
   }

   // I must be greater than 0. I is inserted into the collection if it is.
   public void insert(int i) {
      	if (i > 0) {
	 	int j = 0;
	     	while ((c[j] != 0) && (c[j] != i)) j++;
		if (c[j] == 0) {
			if (j == c.length - 1) {
                            // Create new array with the enlarged length 
                            int[] enlargedArray = new int[c.length * 2];

                            // Pass User Supplied Array's items into the new array 
                            for(i = 0; i < c.length; i++) {
                                enlargedArray[i] = c[i];
                            }
                            
                            // Set User Supplied Array to the new Enlarged Array
                            c = enlargedArray; 
		   	}
		   	c[j] = i; c[j + 1] = 0;
		}
	}
   }

    // i has to be > 0 and if i is in the collection, it is removed.
    public void omit(int i) {
	if (i>0) {
      		int j = 0;
      		while ((c[j] != 0)&&(c[j] != i)) j++;
      		if (c[j] == i) {
         		int k = j+1;
         		while (c[k] != 0) k++;
         		c[j] = c[k-1]; c[k-1]=0;
      		}
	}
   }
   
   // Count how many integers are stored in the array 
   public int get_howmany() {
      	int j=0, howmany=0;
      	while (c[j]!=0) {
            howmany++; j++;
        }
      	return howmany;
   }
   
   // Print out the values in the arra
   public void print() {
      	int j = 0;
      	System.out.println();
      	while (c[j] != 0) {
            System.out.println(c[j]); 
            j++;
      	}
   }
   
   
   public boolean equals(Intcoll1 obj) {
      	int j = 0; 
        boolean result = true;
      	while ((c[j] != 0) && result) {
         	result = obj.belongs(c[j]); 
                j++;
      	}
      	j = 0;
      	while ((obj.c[j] != 0)&&result) {
         	result = belongs(obj.c[j]); 
                j++;
      	}
      	return result;
   }
}

