/**
 *
 * @author Tung Tran
 */
public class ProjectEuler145 implements EulerSolution{
    private int LIMIT = 1000000000;
    public static void main(String[] args) {
        System.out.println(new ProjectEuler145().run()); //1 minute 29 seconds
    }

    @Override
    public String run(){
        int count = 0;
        for(long i = 1; i < LIMIT; i++){
            if(isReversible(i)){
                count++;
            }
        }
        return Integer.toString(count); //2441405
    }
    private static boolean isReversible(long n){
        long number = n;
        if(n%10==0)
            return false;
        
        long reversed = 0;
        while (number > 0) {
            reversed = 10 * reversed + number % 10;
            number /= 10;
        }
        reversed +=n;
        while(reversed>0){
            if((reversed%10)%2==0) return false;  
                reversed /= 10;
        }
        return true;
    }
}
