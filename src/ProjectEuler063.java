import java.math.BigInteger;

/**
 *
 * @author Tung
 */
public class ProjectEuler063 implements EulerSolution{
    /* 
     * Let's examine n^k for different values of n and k and see which
     * choices cannot possibly work (i.e. not being exactly k digits long).
     * 
     * When n = 10, for each k, n^k has exactly k+1 digits, so these are excluded.
     * By extension, when n > 10, for each k, n^k has at least k+1 digits, so these are excluded.
     * Thus we should only consider 1 <= n <= 9.
     * 
     * When n = 9, k = 22, then n^k has 21 digits which is insufficient.
     * Extending this, when n = 9 and k > 22, n^k has fewer than k digits.
     * Furthermore, when n < 9, n^k will have start to have fewer than k digits at some value of k with k < 22.
     * Therefore we should only consider 1 <= k <= 21.
     * 
     * We handle the rest of the testing by brute force.
     */

    public static void main(String[] args) {
        System.out.println(new ProjectEuler063().run());
    }

    @Override
    public String run() {
        int count = 0;
        for(int i = 1; i <= 9; i++){
            for(int k = 1; k<=21; k++){
                if(BigInteger.valueOf(i).pow(k).toString().length() == k){
                    count++;
                }
            }
        }
        return Integer.toString(count);
    }
}
