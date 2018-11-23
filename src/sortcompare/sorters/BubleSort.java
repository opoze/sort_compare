package sortcompare.sorters;

import java.util.Iterator;
import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public class BubleSort extends AbstractSorter{
    
    
    public int[] sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
               exchange(array, j, j-1);
            }
        }
        return array;
    }
    
}
