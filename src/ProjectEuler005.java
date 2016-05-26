/**
 *
 * @author Tung Tran
 */
public class ProjectEuler005 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler005().run());
    }

    @Override
    public String run() {
        int temp = 0;
        for(int i = 1;;i++){
            if ((i%2520 == 0) && (i% 11 == 0) && (i%13 == 0) && (i%17==0) && (i%19==0) && (i%16==0)){
                temp = i;
                break;
            }
        }
        return Integer.toString(temp);
    }
    
}
