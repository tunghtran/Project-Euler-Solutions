/**
 *
 * @author Tung Tran
 */
public class ProjectEuler072 implements EulerSolution{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new ProjectEuler072().run());
    }
    
    @Override
    public String run(){
        int LIMIT = 1000000;
        long sum = 0;
        int[] phi = listTotients(LIMIT);
        for(int i = 2; i <phi.length; i++){
            sum+=phi[i];
        }
        return Long.toString(sum);
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
}
