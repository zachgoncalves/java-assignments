
package intcoll3;

public class Intcoll3 {
    
   // Create a private array of integers named c   
   private boolean[] c;
   private int how_many;

   //Makes the Collection empty and ensures it has capacity for 500 integers. 
   public Intcoll3() {
      	c = new boolean[500+1];
        how_many=0;
   }
   
   // Set an input parameter for the default constructor
   public Intcoll3(int i) {
      	c = new boolean[i+1];        
        how_many=0;
   }

   /* Check if the arrays are different, if they are then create a new array and transfer the values on the array 
    * to the c array in obj. 
    */
   public void copy(Intcoll3 obj) {
      	if (this != obj) {
		c = new boolean[obj.c.length];
		int j = 0;
		while (j < obj.c.length) {
                    c[j] = obj.c[j]; 
                    j++;
		}
                
                this.how_many = obj.how_many;
	}
   }

   // Returns true if I is in the collection and false otherwise
   public boolean belongs(int i) {
        if (i > 0 && i <= c.length) {
            return c[i] = true;
        }
        
        return false;

   }

   // I must be greater than 0. I is inserted into the collection if it is.
   public void insert(int i) {
       if (i > 0 && i <= c.length) {
            c[i] = true;
	    how_many++; 
	} else if(i > c.length) {
            boolean[] enlargedArray = new boolean[c.length + (2*i)];

                for(int k = 0; k < c.length; k++) {
                    enlargedArray[k] = c[k];
                }
                            
                c = enlargedArray; 
            c[i] = true;
	    how_many++;
        }
   }
   
   /* I must be in collection, if it is not then omit does not happen. 
    * If its there, then swap existing number w/ latest in array
    */
    public void omit(int i) {
	if (!belongs(i) && c[i]) {
            c[i] = false;
            how_many--;
	}
    }
   // Count how many integers are stored in the array 
   public int get_howmany() {
      	return this.how_many;
   }
   
   // Print out the values in the array
   public void print() {
      	System.out.println();
        for(int j = 0; j < this.c.length; j++) {
            if(c[j]) {
                System.out.println(j);
            }
        }
             
   }
   
   // Compares the values in two arrays and returns true if equal and false if not equal
   public boolean equals(Intcoll3 obj) {
        boolean result = true;
        
        if(this.how_many == obj.how_many) {
           for(int i = 0; i < this.how_many; i++) {
               c[i] = obj.belongs(i);
               result = true;
           }
        } else if (this.how_many != obj.how_many) {
            result = false; 
        }
        return result; 
   }
}

