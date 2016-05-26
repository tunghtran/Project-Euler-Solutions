/**
 *
 * @author Tung Tran
 */
public class ProjectEuler003{

    public static void main(String[] args) {
        primeFactor(600851475143L);
    }
    
    public static void primeFactor(long n){
        int div = 2;
        do {
            if (n% div == 0){
                n = n/div;
            }
            else
                div++;
        } while ( n > div);
        System.out.printf("The largest prime factor of the given number is %d.\n", div);
    }
}
