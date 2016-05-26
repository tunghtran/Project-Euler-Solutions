/**
 * @author Tung Tran
 */
public class ProjectEuler077 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler077().run());
    }
    
    @Override
    public String run(){
        for(int i  = 0; ; i++){
            if(wayCount(i) > 5000){
                System.out.println(i);
                break;
            }
        }
        return "";
    }
    private static int wayCount(int n){
        int[] ways = new int[n + 1];
        ways[0] = 1;
        boolean isPrime[] = listPrimality(n+1);

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if(isPrime[i]){
                    ways[j] = ways[j] + ways[j - i];
                }
            }
        }
        return ways[n];
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
}
