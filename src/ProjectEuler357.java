/**
 *
 * @author Tung Tran
 */
public class ProjectEuler357 implements EulerSolution{

    private static final int LIMIT = 100000000;
    private static boolean[] isPrime = listPrimality(LIMIT + 1);
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler357().run());
    }
    
    @Override
    public String run(){
        //1 739 023 853 139
        long sum = 0;
        for (int n = 0; n <= LIMIT; n++) {
            if (isPrimeGenerating(n))
                    sum += n;
            }
        return Long.toString(sum);
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
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (result[i]) {
                        // Note: i * i does not overflow
                        for (int j = i * i; j <= n; j += i << 1)
                                result[j] = false;
                }
        }
        return result;
    }
    
    private static boolean isPrimeGenerating(int n) {
        

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (!isPrime[i + n / i])
                    return false;
            }
        }
        return true;
    }
    
    private static int generatePrimes(int max) {
        // initially assume all integers are prime
        boolean[] isPrimeArr = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrimeArr[i] = true;
        }
            
        // mark non-primes <= N using Sieve of Eratosthenes
        for(int i = 2; i*i <= max; i++){
            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., N/i
            if(isPrime[i]){
                for(int j = i; i*j < max; j++){
                    isPrime[i*j] = false;
                }
            }
        }
        // count primes
        int primes = 0;
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) primes++;
        }
        return primes;
    }
}

