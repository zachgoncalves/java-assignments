
package objectpermanence;

import java.util.Arrays;

public class ObjectPermanence {

    public static void main(String[] args) {

        int a = 7;
        int b = 5;
        
        int c = b;
        b++;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        Dog dog1 = new Dog("Max");
        Dog dog2 = new Dog("Buster");
        Dog dog3 = dog2;
        
        dog2.name = "Scooby";
        
        System.out.println("dog 1: " + dog1);
        System.out.println("dog 2: " + dog2);
        System.out.println("dog 3: " + dog3);
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = arr2;
        arr2[0] = -12;
        
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));    
        
    }
            
}
