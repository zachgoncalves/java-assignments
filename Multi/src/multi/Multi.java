
package multi;

import java.util.Arrays;

public class Multi {

    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        
        arr[2][3] = 1; 
        
        System.out.println(Arrays.toString(arr));
        
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (row+1)*(col+1);
            }
        }
        
        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        /*
        for(int row = 0; row < 4; row++) {
            arr[row][2] = 100;
        }
        
        for(int col = 0; col < 4; col++) {
            arr[4][col] = 200;
        }
        
        for(int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        */
        
        
        // overload - 
        // override - take a parent class's method and define new parts of it. 

    }
    
}
