
package qsort;

public class QuickSort {
    
    public static int qcount = 0;
    
    public static int partition(int[] data, int i, int j) {
        int top = i;
        int bottom = j;
        int pivot = data[i];
       
        while(top != bottom) {
            while((top < bottom) && pivot <= data[bottom]) {
                bottom--;
            }
            if(top != bottom) {
                data[top] = data[bottom];
            }
            qcount++;
            while((top < bottom) && (pivot >= data[top])) {
                top++;
            }
            if(top != bottom) {
                data[bottom] = data[top];
            }    
            qcount++;
        }
        data[top] = pivot;
        return top;
    }

    public static void quicksort(int[] data, int top, int bottom) {
        int p;
        if(top < bottom) {
            p = partition(data, top, bottom);
            quicksort(data, top, p-1);
            quicksort(data, p+1, bottom);
        }
    }
    
}
