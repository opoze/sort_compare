package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class QuickSort extends AbstractSorter{
    
    public int[] sort(int[] a) {
//        qsort(a, 0, a.length - 1);
        return a;
    }
    
    private void qsort(int[] a, int low, int high) {
        if (low >= high) return;
        int p = partition(a, low, high);
        qsort(a, low, p - 1);
        qsort(a, p + 1, high);
    }
    
    private int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
               exchange(a, ++i, j);
            }
        }
        exchange(a, i + 1, high);
        return i + 1;
    }
    
}
