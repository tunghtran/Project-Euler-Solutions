import java.util.Arrays;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler041 implements EulerSolution{

    int LIMIT = 7654321;
    char[][] pandigits = new char [][]{
        "1".toCharArray(), 
        "12".toCharArray(),
        "123".toCharArray(),
        "1234".toCharArray(),
        "12345".toCharArray(),
        "123456".toCharArray(),
        "1234567".toCharArray(),
        "12345678".toCharArray(),
        "123456789".toCharArray(),
    };
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler041().run());
    }
    
    @Override
    public String run(){
        int max = 0;
        int[] primes = listPrimes(LIMIT);
        for(int i = primes.length - 1; i >=0; i--){
            if(isPandi(primes[i])){
                max = primes[i];
                break;
            }
        }
        return (Integer.toString(max));
    }
    
    
    private boolean isPandi(int n){
        char[] str = Long.toString(n).toCharArray();
        Arrays.sort(str);
        return Arrays.equals(str, pandigits[str.length - 1]);
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
    
    private static boolean[] listPrimality(int n){
        if(n<0)
            throw new IllegalArgumentException("Negative array size");
        boolean[] result = new boolean[n+1];
        if(n>=2)
            result[2]= true;
        for(int i =3; i<=n; i+=2)
            result[i] = true;
        
        for(int i = 3, end = (int)Math.sqrt(n); i<= end; i+=2){
            if(result[i]){
                for(int j = i*i; j<=n; j+=i)
                    result[j] = false;
            }
        }
        return result;
    }
}