import java.math.BigInteger;

/**
 * @author Tung Tran
 */
public class ProjectEuler056 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler056().run());
    }
    
    @Override
    public String run(){
        BigInteger val;
        BigInteger max = BigInteger.ZERO;
        BigInteger base;
        for(int a = 1; a < 100; a++){
            for (int b = 1; b < 100; b++){
                base = BigInteger.valueOf(a);
                val = base.pow(b);
                BigInteger sum = digitSum(val);
                if(sum.compareTo(max) == 1){
                    max = sum;
                }
            }
        }
        return max.toString();
    }
    
    private static BigInteger digitSum(BigInteger n){
        BigInteger zero = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;
        BigInteger sum = zero;
        BigInteger d;
        while(n!= zero){
            d = n.mod(ten);
            n = n.divide(ten);
            sum = sum.add(d);
        }
        return sum;
    }
}
