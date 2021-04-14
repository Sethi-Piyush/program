/**
 * Created by amura on 2/2/21.
 */
public class Reverse {

    public static void main(String[] args) {

        int r = 4506;
        int reversed = 0;
//        int original = r;
        while (r != 0) {
            int remainder = r % 10;
            reversed = reversed * 10 + remainder;
            r = r / 10;
        }

        System.out.println("Reverse of number is:" + reversed);
    }
}
