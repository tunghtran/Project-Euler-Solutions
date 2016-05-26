/**
 * @author Tung Tran
 */
public class ProjectEuler047 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler047().run());
    }
    
    @Override
    public String run(){
        int res;
        for(int i = 2; ; i++){
            if(has4PrimeFactors(i) && has4PrimeFactors(i+1) && has4PrimeFactors(i+2) && has4PrimeFactors(i+3) ){
                res = i;
                break;
            }
        }
        return Integer.toString(res);
    }
    
    private static boolean has4PrimeFactors(int n){
        return countDistinctPrimeFactor(n) == 4;
    }
    
    private static int countDistinctPrimeFactor(int n){
        int count = 0;
        for(int i = 2, end = (int) Math.sqrt(n); i <= end; i++){
            if(n%i == 0){
                do n/=i;
                while(n%i == 0);
                count++;
                end = (int) Math.sqrt(n);
            }
        }
        if(n>1)
            count++;
        return count;
    }

}
