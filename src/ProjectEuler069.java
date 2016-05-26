/**
 *
 * @author Tung Tran
 */
public class ProjectEuler069 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler069().run());
    }
    
    @Override
    public String run(){
        int LIMIT = 1000000;
        int maxNumer = 0;
        int maxDenom = 1;
        int[] totients = listTotients(LIMIT);

        for (int n = 1; n < totients.length; n++) {
            if ((long)n * maxDenom > (long)maxNumer * totients[n]) {
                maxNumer = n;
                maxDenom = totients[n];
            }
        }
        return Integer.toString(maxNumer);
    }
    private static int[] listTotients(int n) {
        if (n < 0)
                throw new IllegalArgumentException("Negative array size");
        int[] totients = new int[n + 1];
        for (int i = 0; i <= n; i++)
                totients[i] = i;

        for (int i = 2; i <= n; i++) {
                if (totients[i] == i) {  // i is prime
                        for (int j = i; j <= n; j += i)
                                totients[j] = totients[j] / i * (i - 1);
                }
        }
        return totients;
    }
    
    private static int phiFunction(int n){
        int count = 0;
        for(int i = 1; i < n; i++){
            if( lcm(n,i) == n*i){
                count++;
            }
        }
        return count;
    }
    
    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }
    
    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
