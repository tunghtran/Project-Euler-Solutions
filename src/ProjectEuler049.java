import java.util.Arrays;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler049 {

    public static void main(String[] args) {
        int LIMIT = 10000;
        for(int base = 1000; base < LIMIT; base++){
            if(isPrime(base)){
                for(int gap = 1; gap < LIMIT; gap++){
                    int a = base + gap;
                    int b = a + gap;
                    if(a<LIMIT && isPrime(a) && hasSameDigits(base, a) 
                    && b < LIMIT && isPrime(b) && hasSameDigits(a,b) && base!= 1487 && a!=4817){
                        System.out.printf("The three numbers are %d, %d, %d.\n", base, a, b);
                        System.out.println("The three numbers concatenated together yields " + base + a +b);
                    }
                }
            }
        }
    }

    private static boolean hasSameDigits(int a, int b){
        char[] result1 = Integer.toString(a).toCharArray();
        char[] result2 = Integer.toString(b).toCharArray();
        Arrays.sort(result1);
        Arrays.sort(result2);
        return Arrays.equals(result1, result2);
    }
    private static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2)
            return true;
        if(n%2 == 0 && n > 2)
            return false;
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}