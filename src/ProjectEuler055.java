import java.math.BigInteger;

/**
 * @author Tung Tran
 */
public class ProjectEuler055 implements EulerSolution {
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler055().run());
    }

    @Override
    public String run(){
        int count = 0;
        for(int i = 1; i < 10000; i++){
            if(isLychrel(i))
                count++;
        }
        return Integer.toString(count);
    }
    private static boolean isLychrel(int n){
        BigInteger temp = BigInteger.valueOf(n);
        for(int i = 0; i<49; i++){
            BigInteger num = new BigInteger(reverse(temp.toString()));
            temp = temp.add(num);
            if(isPalin(temp.toString()))
                return false;
        }
        return true;
    }
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    private static boolean isPalin(String str){
        String rev = new StringBuffer(str).reverse().toString();
        return str.equals(rev);
    }
}
