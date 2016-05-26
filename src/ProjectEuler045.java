/**
 *
 * @author Tung
 */

public class ProjectEuler045 implements EulerSolution{

    //T_285 = P_165 = H_143
    //For all odd m, H_m belongs to the set of Triangle number
    //So loop and check if a Hexagonal number is also a Pentagonal number or not

    public static void main(String[] args) {
        System.out.println(new ProjectEuler045().run());
    }
    
    
    @Override
    public String run(){
        long result = 0;
        int i = 143;
        while(true){
            i++;
            result = i * (2*i - 1);
            if(isPenta(result)){
                break;
            }
        }
        return Long.toString(result);
    }
    
    public static boolean isPenta(long n){
        //Formula to check if a number if pentagonal
        //https://en.wikipedia.org/wiki/Pentagonal_number#Tests_for_pentagonal_numbers
        
        return (Math.sqrt(24*n+1) + 1) % 6 ==0;
    }
}
