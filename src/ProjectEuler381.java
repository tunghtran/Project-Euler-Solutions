import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler381 implements EulerSolution{
    private static final BigInteger zero = BigInteger.ZERO;
    private static final BigInteger one = BigInteger.ONE;
    
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        int LIMIT = 100000000;
        boolean[] isPrime = listPrimality(LIMIT);
        for(int i = 5; i<=isPrime.length; i++){
            if(isPrime[i])
                sum = sum.add(omegaSum(i));
        }
        System.out.println(sum);
    }

    @Override
    public String run(){
        return "";
    }
    private static boolean[] listPrimality(int n) {
        if (n < 0)
                throw new IllegalArgumentException("Negative array size");
        boolean[] result = new boolean[n + 1];
        if (n >= 2)
                result[2] = true;
        for (int i = 3; i <= n; i += 2)
                result[i] = true;
        // Sieve of Eratosthenes
        for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
                if (result[i]) {
                        // Note: i * i does not overflow
                        for (int j = i * i; j <= n; j += i << 1)
                                result[j] = false;
                }
        }
        return result;
    }
    
    private static BigInteger omegaSum(int n){
        
        BigInteger sum = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;
        
            for(int i = 1; i<=5; i++){
                sum = sum.add(factorial(BigInteger.valueOf(n-i)));
                result = sum.mod(BigInteger.valueOf(n));
            }
        
        return result;
    }
    
    private static BigInteger factorial(BigInteger n) {
        if(n.compareTo(zero) == 0)
            return one;
        if(n.compareTo(one) == 0)
            return n;
        else 
            return n.multiply(factorial(n.subtract(one)));
    }
}
