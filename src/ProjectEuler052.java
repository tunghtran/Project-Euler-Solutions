import java.util.Arrays;

/**
 * @author Tung Tran
 */
public class ProjectEuler052 {

    public static void main(String[] args) {
        for(int i = 1; ; i++){
            if(hasSameDigits(i, 2*i, 3*i, 4*i, 5*i, 6*i)){
                System.out.println(i);
                break;
            }
        }
    }
    
    private static boolean hasSameDigits(int a, int b, int c, int d, int e, int f){
        char[] result1 = Integer.toString(a).toCharArray();
        char[] result2 = Integer.toString(b).toCharArray();
        char[] result3 = Integer.toString(c).toCharArray();
        char[] result4 = Integer.toString(d).toCharArray();
        char[] result5 = Integer.toString(e).toCharArray();
        char[] result6 = Integer.toString(f).toCharArray();
        Arrays.sort(result1);
        Arrays.sort(result2);
        Arrays.sort(result3);
        Arrays.sort(result4);
        Arrays.sort(result5);
        Arrays.sort(result6);
        
        if (Arrays.equals(result1, result2) && Arrays.equals(result2, result3) && Arrays.equals(result3, result4) 
                && Arrays.equals(result4, result5) && Arrays.equals(result5, result6)){
            return true;
        }
        return false;
    }
}
