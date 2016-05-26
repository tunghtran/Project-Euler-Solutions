/**
 *
 * @author Tung Tran
 */
public class ProjectEuler092 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler092().run());
    }
    
    @Override
    public String run(){
        int LIMIT = 10000000;
        int count = 0;
        for(int i = 1; i <= LIMIT; i++){
            if(isNum89(i)){
                count++;
            }
        }
        return Integer.toString(count);
    }
    private static boolean isNum89(int n){
        while(true){
            switch(n){
                case 1: return false;
                case 89: return true;
                default: n = next(n);
            }
        }
    }
    private static int next (int n){
        int sum = 0;
        int d;
        while(n!=0){
            d = n%10;
            n = n/10;
            sum+=d*d;
        }
        return sum;
    }
}
