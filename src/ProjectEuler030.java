/**
 *
 * @author Tung Tran
 */
public class ProjectEuler030 {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler030().run());
    }
   
    public String run(){
        int sum = 0;
        //6*(9^5) = 354294, thus 355000 seems to be a reasonable upper bound
        for(int i = 2; i < 355000 ;i++){
            if(split(i) == i){
                System.out.println(i);
                sum+=i;
            }
        }
        return Integer.toString(sum);
    }
    public static int power(int x, int y){
        if(y==1)
            return x;
        else
            return x* power(x, y-1);
    }

    public static int split(int n){
        String str = Integer.toString(n);
        String[] split = str.split("");
        int[] results = new int[split.length];
        for (int i =0; i < split.length; i++){
            try{
                results[i] = Integer.parseInt(split[i]);
            }
            catch (NumberFormatException nfe){}
        }
        
        int sum = 0;
        for (int i = 0; i < results.length; i++){
            sum += power(results[i], 5);
        }
        return sum;
    }
}
