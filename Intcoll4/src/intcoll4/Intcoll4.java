
package intcoll4;

public class Intcoll4 {
    private ListItem c;
    private int how_many;
    
    //Makes the Collection empty and ensures it has capacity for 500 integers. 
    public Intcoll4() {
        c = null;
        how_many = 0;
    }
    public Intcoll4(int i) {
        c = null;
        how_many = 0;
    }
    
    // Returns true if I is in the collection and false otherwise
    public boolean belongs(int i) {
        ListItem p = c;
        while((p != null) && (p.info != i)) {
            p = p.link;
        }
        return (p != null);
    }
    
    // Inserts i into the collection if its not there and if i is greater than 0. 
    public void insert(int i) {
        if(i > 0) { 
            ListItem p = c;
            while((p != null) && (p.info != i)) {
                p = p.link;
            }
            if(p == null) {
                p = new ListItem(i, c);
                c = p;
                how_many++;
            }
        }
    }
    
    // i has to be > 0 and if i is in the collection, it is removed.
    public void omit(int i) {
        if(i > 0) {
            ListItem p = c, pred = null;
            while((p != null) && (p.info != i)) {
                pred = p;
                p = p.link;
            }
        }
    }
    // Two collections have the same integers 
    public void copy(Intcoll4 obj) {
        if(this != obj) {
            if(obj.c == null) {
                c = null;
            } else {
                this.c = obj.c;
            } 
            this.how_many = obj.how_many;
        }
    }
    
    // Count how many integers are stored in the collection 
    public int get_howmany() {
      	return this.how_many;
    }
   
    // Print out the values in the collection
    public void print() {
        System.out.println();
        ListItem p = c;
        while(p != null) {
            System.out.println(p.info);
            p = p.link;
        }
      
    }
   
    // Compares the values in two collections and returns true if equal and false if not equal
    public boolean equals(Intcoll4 obj) {
        boolean belongs = false;
        if(this.how_many == obj.how_many) {
            for(int i = 0; i < how_many; i++) {
                if(obj.belongs(i) == this.belongs(i)) {
                    belongs = true;
                } else {
                    belongs = false;
                }
            }
        }
        return belongs;
    }
       
    private class ListItem { 
        private int info;
        private ListItem link;
        
        public ListItem() {
            info = 0;
            link = null;
        }
        public ListItem(int i, ListItem p) {
            info = i;
            link = p;
        }
    }
    
}
