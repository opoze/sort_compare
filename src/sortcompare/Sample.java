package sortcompare;

import sortcompare.sorters.AbstractSorter;

/**
 *
 * @author luispozenato
 */
public class Sample {
    
    long[] samples;
    double average;
    double dev;
    int sampleSize;
    int[] data;
    AbstractSorter sorter;

    public Sample(int sampleSize, int[] data, AbstractSorter sorter) {
        this.sampleSize = sampleSize;
        this.data = data;
        this.sorter = sorter;
    }
    
    public double run(){
        samples = sample(sorter, data, sampleSize);
        average = average(samples);
        dev = dev(samples, average);
        average = averageWithDev(samples, average, dev);
        return nano2seconds(average);
    }
    
    private long[] sample(AbstractSorter sorter, int[] array, int times){
        long samples[] = new long[times];
        long start;
        for (int i = 0; i < times; i++) {
            start = System.nanoTime();
            sorter.sort(array);
            samples[i] = System.nanoTime() - start;
        }
        return samples;
    }

    
    private static double nano2seconds(double nanoTime){
        return nanoTime / 1_000_000_000.0;
    }
    
    private double average(long[] samples){
        long sum = 0;
        for (int i = 0; i < samples.length; i++) {
            sum += samples[i];
        }
        return sum / samples.length;
    }
    
    private double averageWithDev(long[] samples, double average, double dev){
        long sum = 0;
        double startRange = dev - average;
        double endRange = dev + average;
        for (int i = 0; i < samples.length; i++) {
            if(samples[i] >= startRange && samples[i] <= endRange){
                sum += samples[i];    
            }
        }
        return sum / samples.length;
    }
    
    private double dev(long[] samples, double average){
        double sum = 0;
        for (int i = 0; i < samples.length; i++) {
            sum += Math.pow((samples[i]-average), 2);
        }
        double variancia = sum / samples.length;
        return Math.sqrt(variancia);
    }
        
}
