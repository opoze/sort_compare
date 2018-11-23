package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class ShellSort extends AbstractSorter{
    
    public int[] sort(int[] array){
        return array;
    }
    
    public void shellSort(int[] a) {
        int h = 1;
        while (3 * h + 1 < a.length) h = 3 * h + 1;
        while (h > 0) {
          for (int i = h; i < a.length; i++) {
             for (int j = i; j >= h  && a[j - h]> a[j]; j -= h) {
              exchange(a, j - h, j);
             }
          }
          h /= 3;
        }
    }
}
