/**
 *
 * @author Tung Tran 
 */

//a < b < c 
//a*a + b*b = c*c
//a+b+c = 1000
//abc = ?

public class ProjectEuler009 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new ProjectEuler009().run());
    }

    @Override
    public String run() {
        int prod = 0;
        int a,b,c;
        for(c = 0; c < 1000; c++){
            for (b = 0; b < c; b++){
                for (a = 0; a < b; a++){
                    if(a+b+c == 1000 && a*a + b*b == c*c){
                        prod = a*b*c;
                    }
                }
            }
        }
        return Integer.toString(prod);
    }
}
