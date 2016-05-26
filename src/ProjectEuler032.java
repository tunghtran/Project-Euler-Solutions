import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tung Tran 
 */
public class ProjectEuler032 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler032().run());
    }

    @Override
    public String run(){
        ArrayList<Long> products = new ArrayList<>();
        long sum = 0;
        long prod, compiled;
        for(long m = 2; m < 100; m++){
            long nBegin = (m>9) ? 123 : 1234;
            long nEnd = 10000/m +1;
            for(long n = nBegin; n < nEnd; n++){
                prod = m * n;
                compiled = concat(concat(prod, n), m);
                if(compiled >=1E8 && compiled < 1E9 && isPandi(compiled)){
                    if(!products.contains(prod)){
                        products.add(prod);
                    }
                }
            }
        }
        for (Long product : products) {
            sum += (product);
        }
        return Long.toString(sum);
    }
    private static long concat(long a, long b){
        String sa = Long.toString(a);
        String sb = Long.toString(b);
        String s = sa.concat(sb);
        long res = Long.parseLong(s);
        return res;
    }
    private static boolean isPandi(long n){
        char[] str = Long.toString(n).toCharArray();
        Arrays.sort(str);
        char[] num = Long.toString(123456789).toCharArray();
        return Arrays.equals(str, num);
    }
}
