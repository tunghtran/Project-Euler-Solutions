import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler029 implements EulerSolution{
    int LIMIT = 100;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler029().run());
    }
    
    @Override
    public String run(){
        Set<BigInteger> generated = new HashSet<>();
		for (int a = 2; a <= LIMIT; a++) {
                    for (int b = 2; b <= LIMIT; b++)
                        generated.add(BigInteger.valueOf(a).pow(b));
                        //The duplicates aren't inserted to Hash Set 
		}
        return (Integer.toString(generated.size()));
    }
}