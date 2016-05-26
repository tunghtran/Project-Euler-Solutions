/**
 *
 * @author Tung Tran
 */
public class ProjectEuler023 {

    private static final int LIMIT = 28123;
    private static final boolean[] isAbundant = new boolean[LIMIT + 1];
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler023().run());
    }

    public String run(){
        for(int i = 1; i < isAbundant.length; i++){
            isAbundant[i] = isAbundant(i);
        }
        
        int sum = 0;
        for(int i = 1; i<=LIMIT; i++){
            if(!isSumOf2Abundant(i)){
                sum+=i;
            }
        }
        return Integer.toString(sum);
    }
    
    private static boolean isSumOf2Abundant(int n){
        for(int i = 0; i <= n; i++){
            if(isAbundant[i] && isAbundant[n-i]){
                return true;
            }
        }
        return false;
    }
    
    private static boolean isAbundant(int n){
        int sum = 1;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++){
            if(n%i == 0){
                sum += i + n/i;
            }
        }
        
        if(end*end == n)
            sum -=end;
        return sum > n;
    }
}
