package sortcompare;

import sortcompare.sorters.AbstractSorter;

/**
 * @author luispozenato
 */
public abstract class AbstractSorterFactory {
   public abstract AbstractSorter create(TypeEnum type);
}