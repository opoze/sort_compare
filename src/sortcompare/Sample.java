package sortcompare;

import sortcompare.sorters.AbstractSorter;

/**
 *
 * @author luispozenato
 */
public class Sample {
    
    long[] samples;
    long average;
    double dev;
    int sampleSize;
    int[] data;
    AbstractSorter sorter;

    public Sample(int sampleSize, int[] data, AbstractSorter sorter) {
        this.sampleSize = sampleSize;
        this.data = data;
        this.sorter = sorter;
    }

    // Retorna médiac considerando desvio padrao
    public double run(){
        samples = sample(sorter, data, sampleSize);
        average = average(samples); // media de tempo em nanosegundos
        dev = dev(samples, average); // desvio padrao double;
        average = averageWithDev(samples, average, dev); // media considerando desvio padrao
        return nano2seconds(average);
    }
    
    // Gera amostra n vezes, amostra significa rodar o algoritmo sorter e salvar o tempo de execução
    private long[] sample(AbstractSorter sorter, int[] data, int times){
        long samples[] = new long[times];
        long start;
        
        // este array é usado como auxilir e recebe um clone do array de inteiros
        // faço isso porque sorter.sort() sempre altera o array original.
        // nao sei porque, em java parace que os parametros sao passados como referencia automaticamente
        
        int[] array;
        for (int i = 0; i < times; i++) {
            array = data.clone();
            start = System.nanoTime();
            sorter.sort(array);
            samples[i] = System.nanoTime() - start;
        }
        return samples;
    }

    // Converte de nanosegundos para segundos
    private static double nano2seconds(long nanoTime){
        return (double)(nanoTime / 1_000_000_000.0);
    }
    
    // Média padrão
    private long average(long[] samples){
        long sum = 0;
        for (int i = 0; i < samples.length; i++) {
            sum += samples[i];
        }
        return (long)(sum / samples.length);
    }
    
    // Média considerando desvio padrão
    private long averageWithDev(long[] samples, long average, double dev){
        long sum = 0;
        double startRange = dev - average;
        double endRange = dev + average;
        for (int i = 0; i < samples.length; i++) {
            if(samples[i] >= startRange && samples[i] <= endRange){
                sum += samples[i];    
            }
        }
        return (long)(sum / samples.length);
    }
    
    // Desvio padrão
    private double dev(long[] samples, double average){
        double sum = 0;
        for (int i = 0; i < samples.length; i++) {
            sum += Math.pow((samples[i]-average), 2);
        }
        double variancia = sum / samples.length;
        return Math.sqrt(variancia);
    }
        
}
