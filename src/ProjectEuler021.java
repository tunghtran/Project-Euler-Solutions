/**
 *
 * @author Tung Tran
 */
public class ProjectEuler021 implements EulerSolution{

    int LIMIT = 10000;
    public static void main(String[] args) {
        System.out.println(new ProjectEuler021().run());
    }

    @Override
    public String run(){
        
        int sum = 0;

        for (int i = 1; i < LIMIT; i++){
            int a = d(i);
            int b = d(a);
            if (i == b && i != a){
                System.out.println(b);
                sum += b;
            }
        }
        return Integer.toString(sum);
    }
    public int d(int n){
        int sum = 0;
        for(int i = 1; i < (n/2 +1) ; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        
        return sum;
    }
}
