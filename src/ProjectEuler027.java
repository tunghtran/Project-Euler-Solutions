/**
 *
 * @author Tung Tran
 */
public class ProjectEuler027 {

    static int LIMIT = 1000;
    public static void main(String[] args) {
        
        long nMax = 0, product = 0;
        for(long a = -1000; a < LIMIT; a++){
            for (long b = -1000; b < LIMIT; b++){
                long count = 0;
                for (int n = 0; ; n++){
                    if ((n*n + a*n + b) > 0 && isPrime(n*n + a*n + b)){
                        count++;
                    }
                    else
                        break;
                }
                if(count > nMax){
                    nMax = count;
                    product = a*b;
                }
            }
        }
        System.out.println(nMax);
        System.out.println(product);
    }
    
    public static boolean isPrime(long n){
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n%2 == 0)
            return false;
        for(int i = 3; i <= Math.sqrt(n); i++){
            if (n % i ==0)
                return false;
        }
        return true;
    }
}
