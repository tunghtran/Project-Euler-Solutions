import java.math.BigInteger;

/**
 * 
 * @author Tung Tran
 */

public class ProjectEuler057 {
    public static void main(String[] args) {
        System.out.println(new ProjectEuler057().run());
    }
    
    private String run() {
        BigInteger n = BigInteger.ZERO;
        BigInteger d = BigInteger.ONE;
        int count = 0;
        /*
        i = 0
        temp = 1*2+0
        n = 1
        d = 2
        
        i = 1
        temp = 2*2+1
        n = 2
        d = 5
        
        i = 2
        temp = 5*2+2
        n = 5
        d = 12
        */
        for(int i = 0; i < 1000; i++){
            BigInteger temp = d.multiply(BigInteger.valueOf(2)).add(n);
            n = d;
            d = temp;
            // Now n/d is the i'th (0-based) continued fraction approximation of sqrt(2) - 1
            if(n.add(d).toString().length() > d.toString().length()){
                count++;
            }
        }
        
        return Integer.toString(count);
    }
}