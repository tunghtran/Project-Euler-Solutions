import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler387 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler387().run());
    }

    private static final long LIMIT = 100000000000000L;
    private BigInteger sum = BigInteger.ZERO;
    
    @Override
    public String run() {
        for (int i = 1; i <= 9; i++)  // All one-digit numbers are trivially Harshad numbers
                findHarshadPrimes(i, i, false);
        
        return sum.toString();
    }
    
    
    private void findHarshadPrimes(long n, int digitSum, boolean isStrong) {
        // Shift left by 1 digit, and try all 10 possibilities for the rightmost digit
        long m = n * 10;
        int s = digitSum;
        for (int i = 0; i < 10 && m < LIMIT; i++, m++, s++) {
                if (isStrong && isPrime(m))
                        sum = sum.add(BigInteger.valueOf(m));
                if (m % s == 0)
                        findHarshadPrimes(m, s, isPrime(m / s));
        }
    }
    
    public boolean isPrime(long n){
        if(n<0)
            throw new IllegalArgumentException("Negative number");
        if(n<=1)
            return false;
        if(n==2)
            return true;
        else{
            if(n%2==0){
                return false;
            }
            else{
                for(int i=3;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
