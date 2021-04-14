import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by amura on 2/2/21.
 */
public class SortStrings {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();

        str.add("strings");
        str.add("is");
        str.add("in");
        str.add("sorted");
        str.add("order");
        str.add("program");

        Collections.sort(str);

        System.out.println(str);
    }
}
