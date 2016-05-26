import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler097 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler097().run());
    }

    @Override
    public String run() {
        BigInteger a = BigInteger.valueOf(28433);
        BigInteger b = BigInteger.valueOf(7830457);
        BigInteger num = a.multiply(BigInteger.valueOf(2).pow(7830457)).add(BigInteger.ONE);
        System.out.println(num.mod(BigInteger.valueOf(10).pow(10)));
        return "";
    }

}
