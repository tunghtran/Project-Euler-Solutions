import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler020 {

    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(1);
        for (int i = 1; i <= 100; i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        
        System.out.printf("100! equals %d \n", num);
        System.out.printf("The sum of the digits of 100! is %d \n", digitsum(num));
    }
    
    //digitsum() to calculate the sum of digits of larger numbers
    public static BigInteger digitsum(BigInteger num){
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger zero = BigInteger.valueOf(0);
        while(num != zero){
            sum = sum.add(num.mod(BigInteger.valueOf(10)));
            num = num.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    
    //Sample digitSum method to calculate the sum of digits of small numbers
    public static long digitSum(long num){
        long d, sum = 0;
        while(num > 0){
            d = num % 10;
            sum += d;
            num = num/10;
        }
        return sum;
    }
}