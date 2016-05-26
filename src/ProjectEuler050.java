/**
 *
 * @author Tung
 */

public class ProjectEuler050 implements EulerSolution{
    
    double LIMIT = Math.pow(10,6);
    
    public static void main(String[] args){
        System.out.println(new ProjectEuler050().run());
    }

    @Override
    public String run(){
        int maxRun = -1;
        long maxSum = 0;
        for(int i = 0; i < LIMIT; i++){
            int sum = 0;
            for(int j = i; j < LIMIT; j++){
                if(isPrime(j)){
                    sum+=j;
                }
                if(sum > LIMIT){
                    break;
                }
                else if(j-i > maxRun && sum > maxSum && isPrime(sum)){
                    maxSum = sum;
                    maxRun = j - i;
                }
            }
        }
        return Long.toString(maxSum);
    }
    
    public boolean isPrime(int n){
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