/**
 *
 * @author Tung Tran
 */
public class ProjectEuler037 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        
        for(int n = 11; count != 11; n+=2){
            if(isPrime(n)){
                if(isTruncatable(n)){
                    ++count;
                    sum += n;
                }
            }
        }
        System.out.printf("Sum is %d.\n", sum);
        System.out.printf("Count is %d.\n", count);
    }
    
    public static boolean isTruncatable(int n){
        int pow = 10;
        boolean leftTrunc = true;
        boolean rightTrunc = true;
        
        while(pow < n){
            if(!isPrime(n/pow)){
                leftTrunc = false;
                break;
            }
            if(!isPrime(n%pow)){
                rightTrunc = false;
                break;
            }
            pow *=10;
        }
        
        return leftTrunc && rightTrunc;
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
    
    public static int digitCount(int n){
        return String.valueOf(n).length();
    }
}