package sortcompare;

/**
 *
 * @author luispozenato
 */
public class Main {

    public static void main(String[] args) {        
        Senario senario = new Senario.Builder()
            .withN(10)
            .withMethod("descPow")
            .build();
        
        senario.dump();
    }
    
}
