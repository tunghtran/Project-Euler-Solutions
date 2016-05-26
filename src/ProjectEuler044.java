/**
 *
 * @author Tung
 */
public class ProjectEuler044 {

    public static void main(String[] args) {
        System.out.println(new ProjectEuler044().run());
    }
    
    public String run(){
        long minD = -1;
        // For each upper pentagonal number index, going upward
        for (int i = 2; ; i++) {
                long pentI = penta(i);
                // If the next number down is more than a found difference, then conclude searching
                if (minD != -1 && pentI - penta(i - 1) > minD)
                        break;

                // For each lower pentagonal number index, going downward
                for (int j = i - 1; j >= 1; j--) {
                        long pentJ = penta(j);
                        long diff = pentI - pentJ;
                        // If the difference is at least as big as a found difference
                        // then stop testing lower pentagonal numbers
                        if (minD != -1 && diff >= minD)
                                break;
                        else if (isPenta(pentI + pentJ) && isPenta(diff) && (minD == -1 || diff < minD))
                                minD = diff;  // Found a smaller difference
                }
        }
        return (Long.toString(minD));
    }
    
    public static long penta(long n){
        return n*(3*n-1)/2;
    }
    
    public static boolean isPenta(long n){
        //Formula to check if a number if pentagonal
        //https://en.wikipedia.org/wiki/Pentagonal_number#Tests_for_pentagonal_numbers
        
        return (Math.sqrt(24*n+1) + 1) % 6 ==0;
    }
}
