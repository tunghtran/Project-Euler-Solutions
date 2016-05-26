/**
 *
 * @author Tung Tran
 */
public class ProjectEuler112 {

    public static void main(String[] args) {
        int bouncies = 0;
        int i = 99;
        while(100*bouncies < 99*i){
            i++;
            if(isBouncy(i)){
                bouncies++;
            }
        }
        System.out.println(i);
        System.out.println(bouncies);
    }

    private static boolean isBouncy(int n){
        boolean inc = false;
        boolean dec = false;
        
        int last = n % 10;
        n = n/10;
        
        while(n>0){
            int next = n%10;
            n/=10;
            if(next < last){
                inc = true;
            }
            else if(next > last){
                dec = true;
            }
            
            last = next;
            
            if(dec && inc){
                return true;
            }
        }
        return inc && dec;
    }
}
