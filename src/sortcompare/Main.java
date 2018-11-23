/*
    This file is part of GB Estruturas I.

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <https://www.gnu.org/licenses/>
 */

/**
 * Unisinos
 * Trabalho em grupo, cadeira Estruturas De Dados Avançadas I
 * Integrantes: Luis Alberto Zagonel Pozenato,
 *              Emersom Martins Unisinos,
 *              André Hoffman
 */

package sortcompare;

import javax.swing.JTable;
import sortcompare.sorters.AbstractSorter;

/**
 *
 * @author luispozenato
 */
public class Main {

    public static void main(String[] args) {
        
        // ALTERE AQUI: a quantidade de testes e a quantidade dados de cada teste
        int[] tests = {1000, 10000};
        
        // Data table
        double[][] tableAsc = new double[tests.length][8];
        double[][] tableDesc = new double[tests.length][8];
        double[][] tableRnd = new double[tests.length][8];        
        double[][] tableStair = new double[tests.length][8];        

        // Inicializa coluna um das tabelas com o tamanho n 
        for (int i = 0; i < tests.length; i++) {
            tableAsc[i][0] = tableDesc[i][0] = tableRnd[i][0] = tableStair[i][0] = tests[i];
        }
       
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
        Cenario[] cenarios = new Cenario[tests.length];
        for (int i = 0; i < tests.length; i++) {
            cenarios[i] = new Cenario(tests[i]);
        }
        
        // Sample
        Sample sample;
        int sampleSize = 10;
      
        for (TypeEnum type : TypeEnum.values()) {
            switch(type){
                case BUBLE: {
                    System.out.println("Running BubleSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), bubleSorter);;
                        tableAsc[i][1] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), heapSorter);
                        tableDesc[i][1] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), bubleSorter);
                        tableRnd[i][1] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), bubleSorter);
                        tableStair[i][1] = sample.run();
                    }
                    break;
                }
                case HEAP: {
                    System.out.println("Running HeapSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), heapSorter);
                        tableAsc[i][2] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), heapSorter);
                        tableDesc[i][2] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), heapSorter);
                        tableRnd[i][2] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), heapSorter);
                        tableStair[i][2] = sample.run();
                    }
                    break;
                }
                case INSERTION: {
                    System.out.println("Running InsertionSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), insertionSorter);
                        tableAsc[i][3] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), insertionSorter);
                        tableDesc[i][3] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), insertionSorter);
                        tableRnd[i][3] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), insertionSorter);
                        tableStair[i][3] = sample.run();
                    }
                    break;
                }
                case MERGE: {
                    System.out.println("Running MergeSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), mergeSorter);
                        tableAsc[i][4] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), mergeSorter);
                        tableDesc[i][4] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), mergeSorter);
                        tableRnd[i][4] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), mergeSorter);
                        tableStair[i][4] = sample.run();
                    }
                    break;
                }
                case QUICK: {
                    System.out.println("Running QuickSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), quickSorter);
                        tableAsc[i][5] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), quickSorter);
                        tableDesc[i][5] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), quickSorter);
                        tableRnd[i][5] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), quickSorter);
                        tableStair[i][5] = sample.run();
                    }
                    break;
                }
                case SELECTION: {
                    System.out.println("Running SelectionSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), selectionSorter);
                        tableAsc[i][6] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), selectionSorter);
                        tableDesc[i][6] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), selectionSorter);
                        tableRnd[i][6] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), selectionSorter);
                        tableStair[i][6] = sample.run();
                    }
                    break;
                }
                case SHELL: {
                    System.out.println("Running ShellSort");
                    for (int i = 0; i < cenarios.length; i++) {
                        sample = new Sample(sampleSize, cenarios[i].getAsc(), shellSorter);
                        tableAsc[i][7] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getDesc(), shellSorter);
                        tableDesc[i][7] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getRnd(), shellSorter);
                        tableRnd[i][7] = sample.run();
                        sample = new Sample(sampleSize, cenarios[i].getStair(), shellSorter);
                        tableStair[i][7] = sample.run();
                    }
                    break;
                }
            }

        }
        
        
        // Display results
        System.out.println("\n");
        dumpTable(tableAsc, "ASCENDENTE");
        System.out.println("\n");
        dumpTable(tableDesc, "DESCENDENTE");
        System.out.println("\n");
        dumpTable(tableRnd, "RANDOM");
        System.out.println("\n");
        dumpTable(tableStair, "ESCADA");
        System.out.println("\n");
    }
    
    
    // Dump table on console
    private static void dumpTable(double[][] data,String name){
        
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";

        String leftAlignFormat = "| %-10s | %-10s |  %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |%n";
        System.out.println(name);
        System.out.format("+------------+------------+-------------+------------+------------+------------+------------+------------+%n");
        System.out.format("|     N      |    BUBLE   |    HEAP     |  INSERTION |    MERGE   |    QUICK   |  SELECTION |    SHELL   | %n");
        System.out.format("+------------+------------+-------------+------------+------------+------------+------------+------------+%n");
        for (int i = 0; i < data.length ; i++) {
            
            int bestIndex = -1;
            double min = 0;
            for (int j = 0; j < 8; j++) {
                if(bestIndex < 0){
                    min = data[i][j];
                    bestIndex = 0;
                }
                else if(data[i][j] < min){
                    min = data[i][j];
                    bestIndex = j;
                }
            }
            
            String[] columns = new String[8];
            columns[0] = String.format("%8d", (int)data[i][0]);
            for (int j = 1; j < 8; j++) {
                columns[j] = String.format("%.8f", data[i][j]);
            }
            
            columns[bestIndex] = ANSI_GREEN_BACKGROUND + columns[bestIndex] + ANSI_RESET;
            
            System.out.format(
                leftAlignFormat,
                columns[0],
                columns[1],
                columns[2],
                columns[3],
                columns[4],
                columns[5],
                columns[6],
                columns[7]
            );
        }
        System.out.format("+------------+------------+-------------+------------+------------+------------+------------+------------+%n");
        

    }

}
