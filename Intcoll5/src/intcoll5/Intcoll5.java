
package intcoll5;

import java.util.*;

public class Intcoll5 {
    private LinkedList<Integer> c;  

    //Makes the Collection empty and ensures it has capacity for 500 integers. 
    public Intcoll5() {
        c = new LinkedList<Integer>(); 
    }
    public Intcoll5(int i) {
        c = new LinkedList<Integer>();
    }

    // Returns true if I is in the collection and false otherwise
    public boolean belongs(int i) {
        if(i > 0) {
            return c.contains(i);
        }  
        return false;
    }
    
    // Inserts i into the collection if its not there and if i is greater than 0. 
    public void insert(int i) {
        Integer I = i;
        if ((i > 0) && (!c.contains(i))) { 
            c.addFirst(I);
        }
    }
    
    // i has to be > 0 and if i is in the collection, it is removed.
    public void omit(int i) {
        if(i > 0) {
            Integer I = i;
            if(c.contains(I)){
                c.remove(I);
            }
        }
    }
    // Two collections have the same integers 
    public void copy(Intcoll5 obj) {
        if(this != obj) {
            ListIterator<Integer> listTraverse = obj.c.listIterator();        
            
            LinkedList<Integer> newList = new LinkedList<>();
            
            while(listTraverse.hasNext()) {
                newList.add(listTraverse.next());
            }
            this.c = newList;
        }
    }
    
    // Count how many integers are stored in the collection 
    public int get_howmany() {
      	return this.c.size();
    }
   
    // Print out the values in the collection
    public void print() {
        System.out.println();
        ListIterator<Integer> listTraverse = c.listIterator();
        while(listTraverse.hasNext()) {
            System.out.println(listTraverse.next());
        }
      
    }
   
    // Compares the values in two collections and returns true if equal and false if not equal
    public boolean equals(Intcoll5 obj) {
        boolean equal = false;
        
        if(this.get_howmany() == obj.get_howmany()) {
            ListIterator<Integer> listTraverse = c.listIterator();
            equal = true;
            
            while(listTraverse.hasNext() && equal) {
                equal = (obj.c.contains(listTraverse.next()));
            }
            
        }

        return equal;
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
