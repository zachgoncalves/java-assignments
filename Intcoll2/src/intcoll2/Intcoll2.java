
package intcoll2;

public class Intcoll2 {      
    
   // Create a private array of integers named c   
   private int[] c;
   private int how_many;

   //Makes the Collection empty and ensures it has capacity for 500 integers. 
   public Intcoll2() {
      	c = new int[500];
        how_many=0;
   }
   
   // Set an input parameter for the default constructor
   public Intcoll2(int i) {
      	c = new int[i+1];        
        how_many=0;
   }

   /* Check if the arrays are different, if they are then create a new array and transfer the values on the array 
    * to the c array in obj. 
    */
   public void copy(Intcoll2 obj) {
      	if (this != obj) {
		c = new int[obj.c.length];
		int j = 0;
		while (j < obj.how_many) {
                    c[j] = obj.c[j]; 
                    j++;
		}
                
                this.how_many = obj.how_many;
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
       if (!belongs(i)) {
	 	int j = 0;
                while ((c[j] != 0) && (c[j] != i)) {
                    j++;
                }
                    
                if (j == c.length) {
                     
                    int[] enlargedArray = new int[c.length * 2];

                    for(i = 0; i < c.length; i++) {
                        enlargedArray[i] = c[i];
                    }
                            
                    c = enlargedArray; 
		}
            c[how_many] = i;
	    how_many++;
            
	}
   }
   
   /* I must be in collection, if it is not then omit does not happen. 
    * If its there, then swap existing number w/ latest in array
    */
    public void omit(int i) {
	if (belongs(i)) {
      		int j = 0;
      		while ((j < how_many)&&(c[j] != i)) j++;
      		if (c[j] == i) {
         		int k = j+1;
         		while (k < how_many) k++;
         		c[j] = c[k-1]; 
                        c[k-1]=0; 
                        how_many--;
      		}
	}
   }
   // Count how many integers are stored in the array 
   public int get_howmany() {
      	return this.how_many;
   }
   
   // Print out the values in the array
   public void print() {
      	System.out.println();
        for(int j = 0; j < this.how_many; j++) {
            System.out.println(c[j]);
        }
             
   }
   
   // Compares the values in two arrays and returns true if equal and false if not equal
   public boolean equals(Intcoll2 obj) {
        boolean result = true;
        if(this.how_many == obj.how_many) {
           for(int i = 0; i < this.how_many; i++) {
            if(obj.belongs(c[i])) {
                result = true;
            } else if (this.c[i] != obj.c[i]) {
                result = false;
            }
           }
        } else if (this.how_many != obj.how_many) {
            result = false; 
        }
        return result; 
   }
}

