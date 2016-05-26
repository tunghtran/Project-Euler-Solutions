import java.math.BigInteger;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler348 implements EulerSolution {

    int LIMIT = 999999999;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler348().run());
    }

    @Override
    public String run() {
        int res = 0;
        for(int i = 2; i < Math.sqrt(LIMIT) ; i++){
            for(int j = 2; j < Math.sqrt(LIMIT) ; j++){
                int count = 0;
                if(isPalindrome(BigInteger.valueOf(i*i + j*j*j))){
                    count++;
                    if(count == 5){
                        res = (i*i + j*j*j);
                    }
                    break;
                }
            }
        }
        return Integer.toString(res);
    }
    
    private static boolean isPalindrome(BigInteger n){
        String str = n.toString(10);
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    
}
