/**
 *
 * @author Tung Tran
 */
public class ProjectEuler004 implements EulerSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new ProjectEuler004().run());
    }

    @Override
    public String run() {
        isPalin(123213);
        int largest = 0;
        for (int i = 999; i > 100; i--){
            for (int j = 999; j > 100; j--){
                int k = i * j;
                if(isPalin(k) && k > largest){
                    largest = k;
                }
            }
        }
        return Integer.toString(largest);
    }
    
    public static boolean isPalin(int i){
        String str = Integer.toString(i);
        String reverse = new StringBuffer(str).reverse().toString();
        return reverse.equals(str);
    }

    
}
