import java.util.*;


/**
 *
 * @author Tung Tran
 */
public class ProjectEuler074 implements EulerSolution{
    private static final int LIMIT = 1000000;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler074().run());
    }
    
    @Override
    public String run() {
        int count = 0;
        for(int i = 0; i < LIMIT; i++){
            if(getChainLength(i) == 60){
                count++;
            }
        }
        return Integer.toString(count);
    }
    
    private static int getChainLength(int n){
        Set<Integer> seen = new HashSet<>();
        while(true){
            if(!seen.add(n))
                return seen.size();
            n = factorialDigit(n);
        }
    }
    private static int factorialDigit(int n){
        
        int sum = 0;
        while(n>0){
            int i = n%10;
            sum += factorial(i);
            n/=10;
        }
        return sum;
    }
    
    private static int factorial(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        else 
            return n*factorial(n-1);
    }
}
