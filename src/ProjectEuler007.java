/**
 *
 * @author Tung Tran 
 */

public class ProjectEuler007 {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler007().run());
    }

    public String run(){
        int counter = 0;
        int num = 1;
        while(counter < 10001){
            num++;
            if(isPrime(num)){
                counter++;
            }
        }
        return Integer.toString(num);
    }
    public static boolean isPrime(int n){
        if(n<0)
            throw new IllegalArgumentException("Negative Input");
        if(n==0 || n==1)
            return false;
        else if(n==2)
            return true;
        else{
            if(n%2==0)
                return false;
            for (int i = 3; i <= Math.sqrt(n); i+=2){
                if (n%i== 0){
                    return false;
                }
            }
        }
        return true;
    }
}