/**
 * Created by amura on 18/2/21.
 */
public class Patterns {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        int r=6;

        String str = "Royalty";
        char[] r = str.toCharArray();
        for (int i=str.length()-1 ; i>=0; i--){
            for (int j=0; j<=i; j++ ){
                System.out.print(r[j]);
            }
            System.out.println();
        }

        for (int i=0 ; i<str.length(); i++){
            for (int j=0; j<=i; j++ ){
                System.out.print(r[i]);
            }
            System.out.println();
        }
    }
}
