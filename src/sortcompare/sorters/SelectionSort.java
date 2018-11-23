package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class SelectionSort extends AbstractSorter{
    
    public int[] sort(int[] a) {
        for (int min, i = 0; i < a.length; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
               if (a[j] < a[min]) {
                  min = j;
               }
            }
            exchange(a, min, i);
        }
        return a;
    }
}
