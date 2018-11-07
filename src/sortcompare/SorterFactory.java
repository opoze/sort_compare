package sortcompare;

import sortcompare.sorters.AbstractSorter;
import sortcompare.sorters.HeapSort;
import sortcompare.sorters.SelectionSort;
import sortcompare.sorters.BubleSort;
import sortcompare.sorters.QuickSort;
import sortcompare.sorters.InsertionSort;
import sortcompare.sorters.MergeSort;
import sortcompare.sorters.ShellSort;

/**
 *
 * @author luispozenato
 */
public class SorterFactory extends AbstractSorterFactory {
 
    @Override
    public AbstractSorter create(TypeEnum type){
        AbstractSorter sorter = null;
        switch (type) {
            case BUBLE: sorter = new BubleSort(); break;
            case INSERTION: sorter = new InsertionSort(); break;
            case SELECTION: sorter = new SelectionSort(); break;
            case HEAP: sorter = new HeapSort(); break;
            case SHELL: sorter = new ShellSort(); break;
            case MERGE: sorter = new MergeSort(); break;
            case QUICK: sorter = new QuickSort(); break;
        }
        return sorter;
    }
    
}
