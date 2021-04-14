/**
 * Created by amura on 16/2/21.
 */
public class Factorial {

    public static void main(String[] args) {
        int x = 5;
        int f = 1;

        for (int i=1; i<=x; i++){
            f = f*i;
        }
        System.out.println(f);
    }

}
