/**
 *
 * @author Tung Tran 
 */
public class ProjectEuler046 {

    public static void main(String[] args) {
        for(int i = 9 ; ; i+=2){
            if(!satisfiedCondition(i)){
                System.out.println(i);
                break;
            }
        }
        
    }
    
    public static boolean satisfiedCondition(int n){
        if(n%2 == 0 || isPrime(n))
           return true;
        for(int i = 1; i*i*2 <=n; i++){
            if(isPrime(n-2*i*i))
                return true;
        }
        return false;
    }
    
    public static boolean isPrime(int n){
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
