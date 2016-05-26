import java.util.Arrays;

/**
 *
 * @author Tung
 */
public class ProjectEuler070 {

    int LIMIT = 10000000;
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler070().run());
    }
    
    public String run(){
        int[] totients = listTotients(LIMIT-1);
        int minNumer = 1;
        int minDenom = 0;
        for(int i = 2; i < totients.length; i++){
            int tot = totients[i];
            if((long)i * minDenom < (long)minNumer * tot && isPermutation(tot, i)){
                minNumer = i;
                minDenom = tot;
            }
        }
        return (Integer.toString(minNumer));
    }
    
    private static boolean isPermutation(int n, int m){
        char[] str = Integer.toString(n).toCharArray();
        char[] perm = Integer.toString(m).toCharArray();
        Arrays.sort(str);
        Arrays.sort(perm);
        return Arrays.equals(str, perm);
    }
    private static int[] listTotients(int n){
        int[] totients = new int[n+1];
        for(int i = 0; i <=n; i++){
            totients[i] = i;
        }
        
        for(int i = 2; i <=n; i++){
            if(totients[i] == i){
                for(int j = i; j <=n; j+=i){
                    totients[j] = totients[j] * (i-1) / i;
                }
            }
        }
        return totients;
    }
}
