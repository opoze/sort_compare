package sortcompare;

import sortcompare.sorters.AbstractSorter;

/**
 *
 * @author luispozenato
 */
public class Main {

    public static void main(String[] args) { 
        
        // Senario Builder
        Senario senario = new Senario.SenarioBuilder()
            .withN(1000)
            .withMethod("asc")
            .build();
        
        // Sorter Factory
        AbstractSorterFactory sorterFactory = new SorterFactory();
        AbstractSorter sorter = sorterFactory.create(TypeEnum.BUBLE);
        sorter.sort(senario);
        
    }
    
}
