/**
 *
 * @author Tung Tran
 */
public class ProjectEuler036 implements EulerSolution{

    private static int LIMIT = 1000000;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler036().run());
    }

    @Override
    public String run(){
        int sum = 0;
        for(int i = 0; i <= LIMIT; i++){
            if(isPalin(i) && isPalinB2(i)){
                sum+=i;
            }
        }
        return (Integer.toString(sum));
    }
    private static boolean isPalin(int n){
        String str = Integer.toString(n);
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
    
    private static boolean isPalinB2(int n){
        String str = Integer.toBinaryString(n);
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
