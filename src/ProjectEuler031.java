/**
 *
 * @author Tung
 */
public class ProjectEuler031 {

    public static void main(String[] args) {
        int count = 0;
        for (int a200 = 0; a200 <= 1; a200++){
            for(int a100 = 0; a100 <= 2; a100++){
                for(int a50 = 0; a50 <= 4; a50++){
                    for(int a20 = 0; a20 <= 10; a20++){
                        for(int a10 = 0; a10 <= 20; a10++){
                            for(int a5 = 0; a5 <= 40; a5++){
                                for(int a2 = 0; a2 <=100; a2++){
                                    for(int a1 = 0; a1 <= 200; a1++){
                                        if((1*a1 + 2*a2 + 5*a5 + 10*a10 + 20*a20 + 50*a50 + 100*a100 + 200*a200 == 200)){
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        } 
        System.out.println(count);
    }
}
