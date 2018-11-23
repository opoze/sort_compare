package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class InsertionSort extends AbstractSorter{
    
    public int[] sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
          for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
              exchange(a, j - 1, j);
          }
        }
        return a;
    }
}
