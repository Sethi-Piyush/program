import java.util.Arrays;

/**
 * Created by amura on 12/2/21.
 */
public class SeparateNumberAndStrings {

    public static void main(String[] args) {

        String str = "strings-0044";
        System.out.println(str.toUpperCase());
        String[] r = str.split("-");
        System.out.println(Arrays.toString(r));
//        Arrays.sort(r);
//        System.out.println(Arrays.asList(r));
        String reversed = "";
        for (int i=0; i<r.length; i++){
            System.out.println(r[i]);
        }


    }
}
