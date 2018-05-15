
package searches;

public class Searches {
    
    public static boolean contains(int[] arr, int target) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        } 
        
        return false; 
    }
    
    public static int indexOf(int[] arr, int target) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        } 
        
        return -1; 
    }
      
    public static void main(String[] args) {
        
        int[] arr = {74, 123, 23, 65643, -2, 142, 747, 32423};
        System.out.println(contains(arr, -2));
        System.out.println(indexOf(arr, 10000));        
        
    }
    
}
