package sortcompare.sorters;

import sortcompare.Cenario;

/**
 *
 * @author luispozenato
 */
public abstract class AbstractSorter {  
    // sort with data in ArrayList interator
    public abstract int[] sort(int[] array);
    
    protected void exchange(int[] array, int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
