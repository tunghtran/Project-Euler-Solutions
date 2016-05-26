import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Tung Tran
 */
public class ProjectEuler125 implements EulerSolution{

    int limit = 100000000;
    int sqrtLimit = 10000;
    public static void main(String[] args) {
        System.out.println(new ProjectEuler125().run());
    }
    
    @Override
    public String run(){
        long sum = 0;
        SortedSet list = new TreeSet();
        for(int i = 1; i <= sqrtLimit; i++){
            int number = i*i;
            for(int j = i+1; j <= sqrtLimit; j++){
                number += j*j;
                if(number > limit) break;
                
                if(isPalindrome(number) && !list.contains(number)){
                    sum+=number;
                    list.add(number);
                }
            }
        }
        return Long.toString(sum);
    }
    
    private static boolean isPalindrome(int n){
        String str = Integer.toString(n);
        String rev = new StringBuilder(str).reverse().toString();
        return rev.equals(str);
    }
}