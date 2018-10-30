package sortcompare;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author luispozenato
 */
public class SenarioGenerator {
    
    private ArrayList<Long> array;

    public SenarioGenerator() {
        array = new ArrayList();
    }

    public ArrayList<Long> ascRandom(Integer n) {
        if(n > 1000000 ){
            throw new InvalidParameterException("n max 1000000.");
        }
        Random r = new Random(); 
        r.setSeed(System.currentTimeMillis());
        int step = 200;
        int count = 0;
        long lastVal = 0;
        long currVal = 0;
        while(count < n) { 
            currVal = r.nextInt(step);
            lastVal = lastVal + currVal; 
            System.out.print(lastVal + ", ");
            array.add(lastVal);
            count++;
        }
        return array;
    }
 
    public ArrayList<Long> descRandom(Integer n) {
        if(n > 1000000 ){
            throw new InvalidParameterException("n max 1000000.");
        }
        Random r = new Random(); 
        r.setSeed(System.currentTimeMillis());
        int step = 200;
        int count = 0;
        long lastVal = n * step;
        long currVal = 0;
        while(count < n) { 
            currVal = r.nextInt(step);
            lastVal = lastVal - currVal; 
            System.out.print(lastVal + ", ");
            array.add(lastVal);
            count++;
        }
        return array;
    }
    
    public ArrayList<Long> ascPow(int n){        
        for (int i = 0; i < n; i++) {
            array.add((long)Math.pow(2, i));
        }
        return array;
    }
    
    public ArrayList<Long> descPow(int n){        
        for (int i = n - 1; i > -1; i--) {
            array.add((long)Math.pow(2, i));
        }
        return array;
    }
    
    public void dump(){
        for (Iterator<Long> i = array.iterator(); i.hasNext();) {
            String item = i.next().toString();
            System.out.print(item + ", ");
        }        
    }
    
}
