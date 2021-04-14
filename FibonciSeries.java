/**
 * Created by amura on 12/2/21.
 */
public class FibonciSeries {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13 21 34

        int x = 0;
        int x0 = 1;
        int r = 10;

        for (int i=0; i<r; i++){
            System.out.println(x);
            int sum = x + x0;
            x = x0;
            x0 = sum;
        }
    }
}
