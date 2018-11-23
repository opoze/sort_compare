package sortcompare;

import sortcompare.sorters.AbstractSorter;

/**
 *
 * @author luispozenato
 */
public class Main {
    
    

    public static void main(String[] args) {
       
        // Data table
        double[][] tableAsc = new double[10][8];
        double[][] tableDesc = new double[10][8];
        double[][] tableRnd = new double[10][8];        
        double[][] tableStair = new double[10][8];        

        tableAsc[0][0] = tableDesc[0][0] = tableRnd[0][0] = tableStair[0][0] = 128;
        tableAsc[1][0] = tableDesc[1][0] = tableRnd[1][0] = tableStair[1][0] = 256;
        tableAsc[2][0] = tableDesc[2][0] = tableRnd[2][0] = tableStair[2][0] = 512;
        tableAsc[3][0] = tableDesc[3][0] = tableRnd[3][0] = tableStair[3][0] = 1024;
        tableAsc[4][0] = tableDesc[4][0] = tableRnd[4][0] = tableStair[4][0] = 2048;
        tableAsc[5][0] = tableDesc[5][0] = tableRnd[5][0] = tableStair[5][0] = 4096;
        tableAsc[6][0] = tableDesc[6][0] = tableRnd[6][0] = tableStair[6][0] = 8192;
        tableAsc[7][0] = tableDesc[7][0] = tableRnd[7][0] = tableStair[7][0] = 16384;
        tableAsc[8][0] = tableDesc[8][0] = tableRnd[8][0] = tableStair[8][0] = 32768;
        tableAsc[9][0] = tableDesc[9][0] = tableRnd[9][0] = tableStair[9][0] = 65536;
        
        // Sorter Factory
        AbstractSorterFactory sorterFactory = new SorterFactory();
        
        // Sorters
        AbstractSorter bubleSorter = sorterFactory.create(TypeEnum.BUBLE);
        AbstractSorter heapSorter = sorterFactory.create(TypeEnum.HEAP);
        AbstractSorter insertionSorter = sorterFactory.create(TypeEnum.INSERTION);
        AbstractSorter mergeSorter = sorterFactory.create(TypeEnum.MERGE);
        AbstractSorter quickSorter = sorterFactory.create(TypeEnum.QUICK);
        AbstractSorter selectionSorter = sorterFactory.create(TypeEnum.SELECTION);
        AbstractSorter shellSorter = sorterFactory.create(TypeEnum.SHELL);
        
        // Cenarios
        Cenario[] cenarios = new Cenario[110];
        cenarios[0] = new Cenario(128);
        cenarios[1] = new Cenario(256);
        cenarios[2] = new Cenario(512);
        cenarios[3] = new Cenario(1024);
        cenarios[4] = new Cenario(2048);
        cenarios[5] = new Cenario(4096);
        cenarios[6] = new Cenario(8192);
        cenarios[7] = new Cenario(16384);
        cenarios[8] = new Cenario(32768);
        cenarios[9] = new Cenario(65536);
        
        // Sample
        Sample sample;
        
      
        for (TypeEnum type : TypeEnum.values()) {
            switch(type){
                case BUBLE: {
                    System.out.println("Processando BubleSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => BubleSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), bubleSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => BubleSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), bubleSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => BubleSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), bubleSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => BubleSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), bubleSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("BubleSort OK");
                    break;
                }
                case HEAP: {
                    System.out.println("Processando HeapSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => HeapSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), heapSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => HeapSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), heapSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => HeapSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), heapSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => HeapSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), heapSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("HeapSort OK");
                    break;
                }
                case INSERTION: {
                    System.out.println("Processando InsertionSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => InsertionSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), insertionSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => InsertionSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), insertionSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => InsertionSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), insertionSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => InsertionSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), insertionSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("InsertionSort OK");
                    break;
                }
                case MERGE: {
                    System.out.println("Processando MergeSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => MergeSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), mergeSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => MergeSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), mergeSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => MergeSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), mergeSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => MergeSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), mergeSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("MergeSort OK");
                    break;
                }
                case QUICK: {
                    System.out.println("Processando QuickSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => QuickSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), quickSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => QuickSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), quickSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => QuickSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), quickSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => QuickSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), quickSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("QuickSort OK");
                    break;
                }
                case SELECTION: {
                    System.out.println("Processando SelectionSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => SelectionSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), selectionSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => SelectionSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), selectionSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => SelectionSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), selectionSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => SelectionSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), selectionSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("SelectionSort OK");
                    break;
                }
                case SHELL: {
                    System.out.println("Processando ShellSort");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Processando => ShellSort, Ascendente, \t" + (int)tableAsc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getAsc(), shellSorter);
                        tableAsc[i][1] = sample.run();
                        System.out.println("Processando => ShellSort, Descendente, \t" + (int)tableDesc[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getDesc(), shellSorter);
                        tableDesc[i][1] = sample.run();
                        System.out.println("Processando => ShellSort, Aleatório, \t" + (int)tableRnd[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getRnd(), shellSorter);
                        tableRnd[i][1] = sample.run();
                        System.out.println("Processando => ShellSort, Escada, \t" + (int)tableStair[i][0] + " ...");
                        sample = new Sample(10, cenarios[i].getStair(), shellSorter);
                        tableStair[i][1] = sample.run();
                    }
                    System.out.println("ShellSort OK");
                    break;
                }
            }
            
            
            dumpTable(tableAsc);
        }
        
        

    }
    
    private static void dumpTable(double[][] table){
        System.out.println("N\t\tBUBLE\t\tHEAP\t\tINSERTION\t\tMERGE\t\tQUICK\t\tSELECTION\t\tSHELL");
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(String.format("%.2f", table[i][j]) + "\t\t");
            }
            System.out.println("\n");
        }
    }

}
