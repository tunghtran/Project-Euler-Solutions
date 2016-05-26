/**
 *
 * @author Tung Tran 
 */
public class ProjectEuler012 {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 1;  ;i++){
            x+=i;
            if(findDivisor(x) >= 500){
                System.out.println(x);
                break;
            }
        }
    }

    public static int findDivisor(int n){
        int count = 0;
        for (int i = 1; i <Math.sqrt(n); i++){
            if (n % i ==0){
                count+=2;
            }
            if (i*i == n)
                count++;
        }
        return count;
    }
}
