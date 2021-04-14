import java.util.Arrays;

/**
 * Created by amura on 25/2/21.
 */
public class SeparateEvenOddNumbers {

    public static void main(String[] args){
        int[] r = {1, 2, 28, 3, 4, 5, 6};
        r=findEvenOddNumbers(r);
        for (int i=0; i<r.length; i++){
            System.out.print(r[i] + " ");
        }
    }

    public static int[] findEvenOddNumbers(int r[]) {
        int x = 0;
        int o = r.length - 1;

        for (int i = 0; i < r.length; i++) {
            while (r[x] % 2 == 0) {
                x++;
            }
            while (r[o] % 2 == 1) {
                o--;
            }

            if (x < o) {
                int u = r[x];
                r[x] = r[o];
                r[o] = u;
            }
        }
        return r;
    }
}
