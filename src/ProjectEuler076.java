/**
 *
 * @author Tung Tran
 */
public class ProjectEuler076 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(wayCount(100));
    }
    
    private static int wayCount(int n){
        int[] ways = new int[n + 1];
        ways[0] = 1;

        for (int i = 1; i <= 99; i++) {
            for (int j = i; j <= n; j++) {
                ways[j] = ways[j] + ways[j - i];
            }
        }
        return ways[n];
    }
}
