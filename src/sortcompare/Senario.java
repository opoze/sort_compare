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
    
    private void asc(int n){
        dataList = new ArrayList();
        for (int i = 0; i < n; i++) {
            dataList.add((long)(i * Math.log(i)));
        }
    }
    
    private void desc(int n){ 
        dataList = new ArrayList();
        for (int i = n - 1; i > -1; i--) {
            dataList.add((long)(2 * i));
        }
    }
    
    private void random(int n){
        dataList = new ArrayList();
        for (int i = 0; i < n; i++) {
            dataList.add((long)(2 * i + 1));
        }
    }
    
    private void cascade(int n){ 
        dataList = new ArrayList();
        for (int i = 0; i < n; i++) {
            dataList.add((long)(2 * i));
        }
    }
    
    private void generate() {
        switch(method){
            case "asc": asc(n); break;
            case "desc": desc(n); break;
            case "random": random(n); break;
            case "cascade": cascade(n); break;
        }
    }
    
    private Senario(SenarioBuilder builder){
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
    
    public static class SenarioBuilder{
        private int n;
        private String method;
        
        public SenarioBuilder(){}
        
        public SenarioBuilder withN(int n){
            this.n = n;
            return this;
        }
        
        public SenarioBuilder withMethod(String method){
            this.method = method;
            return this;
        }
        
        public Senario build(){
            return new Senario(this);
        }
                
    }
}
