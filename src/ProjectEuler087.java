import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler087 {

    int LIMIT = 50000000;
    int[] primes = listPrimes(7071);
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler087().run());
    }
    
    public String run(){
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        
        for (int i = 2; i <= 4; i++) {
            Set<Integer> newsums = new HashSet<>();
            for (int p : primes) {
                long q = 1;
                for (int j = 0; j < i; j++){
                    q *= p;
                    // q = p^i
                }
                    
                if (q > LIMIT){
                    break;
                }
                      
                int r = (int)q;
                for (int x : sums) {
                    if (x + r <= LIMIT)
                        newsums.add(x + r);
                    }
                }
                sums = newsums;
            }
        
        return Integer.toString(sums.size());
    }
    
    public static int[] listPrimes(int n) {
        boolean[] isprime = listPrimality(n);
        int count = 0;
        for (boolean b : isprime) {
            if (b)
                count++;
        }

        int[] result = new int[count];
            for (int i = 0, j = 0; i < isprime.length; i++) {
                if (isprime[i]) {
                    result[j] = i;
                    j++;
                }
        }
        return result;
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
                        for (int j = i * i; j <= n; j += i)
                                result[j] = false;
                }
        }
        return result;
    }
}
