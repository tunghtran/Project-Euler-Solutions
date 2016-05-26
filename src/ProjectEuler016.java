

import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler016 {

    static BigInteger two = BigInteger.valueOf(2);
    
    public static void main(String[] args) {
        
        System.out.println(digitsum(BigInteger.valueOf(1992)));
        System.out.println(digitsum(two.pow(1000)));
    }
    
    public static BigInteger digitsum(BigInteger num){
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger zero = BigInteger.valueOf(0);
        while(num != zero){
            sum = sum.add(num.mod(BigInteger.valueOf(10)));
            num = num.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
}
