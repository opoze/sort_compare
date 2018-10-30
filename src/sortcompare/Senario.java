package sortcompare;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author luispozenato
 */
public class Senario {
    private int n;
    private ArrayList<Long> dataList;
    private String method;
    
    private void ascPow(int n){
        dataList = new ArrayList();
        for (int i = 0; i < n; i++) {
            dataList.add((long)Math.pow(2, i));
        }
    }
    
    private void descPow(int n){ 
        dataList = new ArrayList();
        for (int i = n - 1; i > -1; i--) {
            dataList.add((long)Math.pow(2, i));
        }
    }
    
    private void generate() {
        switch(method){
            case "ascPow": ascPow(n); break;
            case "descPow": descPow(n); break;
        }
    }
    
    private Senario(Builder builder){
        n = builder.n;
        method = builder.method;
        this.generate();
    }
    
    public ArrayList<Long> get() {
        return dataList;
    }
    
    public void dump(){
        for (Iterator<Long> i = dataList.iterator(); i.hasNext();) {
            String item = i.next().toString();
            System.out.print(item + ", ");
        }
    }
    
    public static class Builder{
        private int n;
        private String method;
        
        public Builder(){}
        
        public Builder withN(int n){
            this.n = n;
            return this;
        }
        
        public Builder withMethod(String method){
            this.method = method;
            return this;
        }
        
        public Senario build(){
            return new Senario(this);
        }
                
    }
}
