import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler066 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler066().run());
    }

    @Override
    public String run() {
        BigInteger max = BigInteger.ZERO;
       BigInteger dMax = BigInteger.ZERO;
       for(int d = 0; d <= 1000; d++){
           for(int y = 0; ; y++){
               for(int x = 0; ; x++){
                   if(x*x - d*y*y == 1 && BigInteger.valueOf(x).compareTo(max) == 1){
                       max = BigInteger.valueOf(x);
                       dMax = BigInteger.valueOf(d);
                       break;
                   }
               }
           }
       }
       return (dMax).toString();
    }

}
