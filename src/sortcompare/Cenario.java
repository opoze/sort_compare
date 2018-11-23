package sortcompare;

import java.util.Random;

/**
 *
 * @author luispozenato
 */
public class Cenario {
    
    private int[] asc;
    private int[] desc;
    private int[] rnd;
    private int[] stair;
    private int n;
    int factor = 3;

    public Cenario(int n) {
        this.n = n;
        asc = new int[n];
        desc = new int[n];
        rnd = new int[n];
        stair = new int[n];
        Random r = new Random();
        
        // Generate asc and desc
        for (int i = 0; i < n; i++) {
            asc[i] = i;
            desc[n-i-1] = i;
            rnd[i] = i;
            stair[i] = i;
        }
        
        // Generate random unique
        int aux, index;
        for (int i = n-1; i > 0; i--) {
            aux = rnd[i];
            
            index = r.nextInt(i+1);
            rnd[i] = rnd[index];
            rnd[index] = aux;
            
            aux = stair[i];
            index = r.nextInt(i+1);
            stair[i] = stair[index];
            stair[index] = aux;
            
        }
        
        //repeat factor
        for(int i = 0; i < n; i+=factor){
            aux = stair[i];
            for(int j = i; j < i + factor && j < n; j++){
                stair[j] = aux;
            }
        }
        
    }
    
    public int[] getAsc(){
        return asc;
    }
    
    public int[] getDesc(){
        return desc;
    }
    
    public int[] getRnd(){
        return rnd;
    }
    
    public int[] getStair(){
        return stair;
    }
    

    
    public void dump(){
        System.out.println("ASC:");
        for (int i = 0; i < this.n; i++) {
            System.out.print(asc[i] + ", ");
        }
        
        System.out.println("DESC:");
        for (int i = 0; i < this.n; i++) {
            System.out.print(desc[i] + ", ");
        }
        
        System.out.println("RDR:");
        for (int i = 0; i < this.n; i++) {
            System.out.print(rnd[i] + ", ");
        }
        
        System.out.println("STAIR:");
        for (int i = 0; i < this.n; i++) {
            System.out.print(stair[i] + ", ");
        }
    }
}
