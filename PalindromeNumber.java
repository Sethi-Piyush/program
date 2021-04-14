/**
 * Created by amura on 2/2/21.
 */
public class PalindromeNumber {

    public static void main(String[] args) {


        int r = 123456; int reversed = 0; int original = r;
        while   (r!=0){
            int remainder = r%10;
            reversed = reversed * 10 + remainder;
            r = r/10;
        }

        System.out.println("Reverse of number is:" + reversed);

        if (original==reversed){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("It's not a palindrome number");
        }
    }

}
