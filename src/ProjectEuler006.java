/**
 *
 * @author Tung Tran
 */ 
public class ProjectEuler006 {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i<=100; i++){
            sum1 += i*i;
        }
        int n = ((100+1)*100/2);
        sum2 = n*n;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(Math.abs(sum1 - sum2));
    }

}
