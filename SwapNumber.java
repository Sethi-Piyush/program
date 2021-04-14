/**
 * Created by amura on 3/2/21.
 */
public class SwapNumber {

    public static void main(String[] args) {

        int r = 100;
        int x = 200;

        r = r+x;
        x = r-x;
        r = r-x;

        System.out.println(r);
        System.out.println(x);

        // Using third variable o
        int o;
        o = r;
        r = x;
        x = o;

        System.out.println(r);
        System.out.println(x);
    }
}
