package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class HeapSort extends AbstractSorter{

    public int[] sort(int[] a) {
        buildMaxHeap(a);
        for (int i = a.length - 1; i > 0; i--) {
            exchange(a, 0, i);
            maxHeapify(a, 0, i); 
        }
        return a;
    }
    
    private void buildMaxHeap(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, a.length);
        }
    }
    
    private void maxHeapify(int[] a, int i, int n) {
        int max = 2 * i + 1;
        if (max + 1 < n && a[max] < a[max + 1]) max++;
        if (max < n && a[max] > a[i]) {
            exchange(a, i, max);
            maxHeapify(a, max, n);
        }
    }

}







