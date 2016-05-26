/**
 *
 * @author Tung Tran
 */
public class ProjectEuler010 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler010().run());
    }
    
    @Override
    public String run() {
        //Note: use long rather than int or float to avoid loss of process
        long sum = 0;
        int limit = 2000000;
        for (int num = 2; num < limit; num++){
            if(isPrime(num)){
                sum += num;
            }
        }
        return Long.toString(sum);
    }
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n%i== 0){
                return false;
            }
        }
        return true;
    }
}
