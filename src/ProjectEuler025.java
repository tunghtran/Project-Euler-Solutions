import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler025 implements EulerSolution {

    BigInteger LIMIT = BigInteger.TEN.pow(999);
    
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler025().run());
    }
    
    @Override
    public String run(){
        int i = 0;
        
        int count = 2;
        BigInteger[] fib = new BigInteger[3];
        fib[0] = BigInteger.ONE;
        fib[2] = BigInteger.ONE;
        
        while(fib[i].compareTo(LIMIT) == -1){
            i = (i+1)%3;
            count++;
            fib[i] = fib[((i+1)%3)].add(fib[((i+2)%3)]);
        }
        return Integer.toString(count);
    }
}
