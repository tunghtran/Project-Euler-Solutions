import java.math.BigInteger;

/**
 * @author Tung Tran
 */
public class ProjectEuler053 {
    private static final BigInteger zero = BigInteger.ZERO;
    private static final BigInteger one = BigInteger.ONE;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler053().run());
    }

    public String run(){
        int count = 0;
        for(int n = 1; n<=100; n++){
            for(int r = 1; r <= n; r++){
                BigInteger res = combi(BigInteger.valueOf(n), BigInteger.valueOf(r));
                if(res.compareTo(BigInteger.valueOf(1000000)) == 1){
                    count++;
                }
            }
        }
        return Integer.toString(count);
    }
    
    private static BigInteger combi(BigInteger n, BigInteger r){
        BigInteger result = factorial(n).divide(factorial(r).multiply(factorial(n.subtract(r))));
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
