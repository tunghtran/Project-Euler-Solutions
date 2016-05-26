/**
 * @author Tung Tran
 */
public class ProjectEuler014 implements EulerSolution{
    
    public static void main(String[] args) {
        System.out.println(new ProjectEuler014().run());
    }

    @Override
    public String run() {
        long maxCount = 0;
        long maxVal = 0;
        long num;
        
        for(int i = 1000000; i >= 2; i--){
            int count = 1;
            num = i;
            while(num!=1){
                if(num%2 == 0){
                    num = num/2;
                }
                else{ 
                    num = (3*num+1);
                }
                count++;
            }
             
            if(count > maxCount){
                maxCount = count;
                maxVal = i;
            }
        }
        
        System.out.printf("The starting number %d produces the longest sequence with %d elements\n",maxVal, maxCount);
        return "";
    }
}
