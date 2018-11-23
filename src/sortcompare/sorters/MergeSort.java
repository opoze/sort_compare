package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class MergeSort extends AbstractSorter{

    public int[] sort(int[] a) {
        int[] aux = new int[a.length];
        divide(a, aux, 0, a.length - 1);
        return a;
    }
    
    private void divide(int[] a, int[] aux, int low, int high) {
        if (low >= high) return;
        int middle = (low + high) / 2;
        divide(a, aux, low, middle);
        divide(a, aux, middle + 1, high);
        conquer(a, aux, low, middle, high);
    }
    
    private void conquer(int[] a, int[] aux, int low, int middle, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low, j = middle + 1;
        for (int k = low; k <= high; k++) {
            if (i > middle) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
