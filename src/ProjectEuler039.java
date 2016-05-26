/**
 *
 * @author Tung Tran
 */
public class ProjectEuler039 {

    public static void main(String[] args) {
        int result = 0;
        int maxNumberOfSolution = 0;
        for(int p = 2; p <=1000; p++){
            int numberOfSolution = 0;
            for(int a = 2; a < p/3; a++){
                if ((p*(p-2*a)%(2*(p-a))) == 0){
                    numberOfSolution++;
                }
            }
            if(numberOfSolution > maxNumberOfSolution){
                maxNumberOfSolution = numberOfSolution;
                result = p;
            }
        }
        System.out.printf("p = %d yields the maximum number of solutions, at %d.\n", result, maxNumberOfSolution);
    }

}
