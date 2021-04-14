/**
 * Created by amura on 2/2/21.
 */
public class PrimeNumber {

    public static void main(String[] args) {

        int r = 29; int o;
        boolean x = true;

        for (int i=2; i<=r/2; i++){
            o = r%i;
            if (o==0){
                x = false;
            }
        }
        if (x){
            System.out.println("Prime number");
        }
        else
        {   System.out.println("Not a prime number");}
    }
}
