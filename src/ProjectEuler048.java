import java.math.BigInteger;

/**
 * @author Tung Tran
 */
public class ProjectEuler048 implements EulerSolution{
    BigInteger modulus = BigInteger.TEN.pow(10); //modulus = 10^10
    BigInteger result = BigInteger.ZERO; //initial result = 0
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler048().run());
    }
    
    @Override
    public String run(){
        for(int i = 1; i <=1000; i++){
            result = result.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
            //result = i^i mod modulus for i from 1 to 1000
            //result += result
        }
        return result.mod(modulus).toString();
    }
}
