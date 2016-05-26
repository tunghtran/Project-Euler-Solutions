/**
 *
 * @author Tung Tran
 */
public class ProjectEuler001 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler001().run());
    }

    @Override
    public String run() {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 1000; i++){
            if (i%3 == 0){
                sum1 += i;
            }
            else if (i%5 == 0){
                sum2 +=i;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return Integer.toString(sum1 + sum2);
    }
}
