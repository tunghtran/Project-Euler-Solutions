/**
 *
 * @author Tung Tran 
 */
public class ProjectEuler034 implements EulerSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new ProjectEuler034().run());
    }
    
    @Override
    public String run(){
        int sum = 0;
        //Let P(n) be the sum of the factorials of the digits of n
        //9! = 362880, so we can expect a 7-digit number to have P(n) of at most 7 digits, since P(9999999) = 2540160
        //An 8-digit number will also yield at most a seven-digit P(n)
        //The highest P(n) we can get that is < 2540160 is 2117281 when n = 1999999
        //Thus use 2117281 as upper-bound
        for(int i = 3; i < 2117281 ; i++){
            if (check(i)){
                sum+=i;
                System.out.println(i);
            }
        }
        return Integer.toString(sum);
    }
    
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
    
    public static int sum (int n){
        int d, sum = 0;
        while(n > 0){
            d = n%10;
            n = n/10;
            sum += factorial(d);
        }
        return sum;
    }
    
    public static boolean check(int n){
        return n == sum(n);
    }
}
