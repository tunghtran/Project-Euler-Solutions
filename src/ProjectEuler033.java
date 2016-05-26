/**
 *
 * @author Tung Tran
 */
public class ProjectEuler033 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int denProd = 1;
        int nomProd = 1;
        for(int i = 1; i < 10; i++){
            for(int den = 1; den <i; den++){
                for(int nom = 1; nom<den; nom++){
                    if(den*(10*nom+i) == nom*(10*i+den)){
                        System.out.printf("%d/%d, simplified as %d/%d\n", (10*nom+i), (10*i+den), nom, den);
                        nomProd *=nom;
                        denProd *=den;
                        
                    }
                }
            }
        }
        denProd = denProd/gcd(nomProd, denProd);
        System.out.println(denProd);
    }

    private static int gcd(int a, int b)
    {
        if (a == 0 || b ==0)
            return (a+b); //Base case
        else
        {
            if(a%b == 0)
                return b;
            return gcd(b, a%b);
        }
        
    }
}
