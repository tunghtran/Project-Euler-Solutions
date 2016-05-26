import java.util.Arrays;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler038 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler038().run());
    }

    @Override
    public String run(){
        long result = 0;
        for(long i = 9876; i >=9123; i--){
            result = concat(i, 2*i);
            if(isPandigital(result)){
                break;
            }
        }
        return Long.toString(result);
    }
    private static long concat(long a, long b){
        String stra = Long.toString(a);
        String strb = Long.toString(b);
        String str = stra.concat(strb);
        long res = Long.parseLong(str);
        return res;
    }
    
    private static boolean isPandigital(long n){
        char[] str = Long.toString(n).toCharArray();
        char[] num = Integer.toString(987654321).toCharArray();
        Arrays.sort(str);
        Arrays.sort(num);
        return Arrays.equals(num, str);
    }
}
