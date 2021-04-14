import java.util.*;

/**
 * Created by amura on 18/2/21.
 */
public class CountCommonCharactersStrings {

    public static void main(String[] args) {
        CountCommonCharactersStrings strings = new CountCommonCharactersStrings();
        strings.countCharacters("program", "programs");
        System.out.println();

    }

    public static void countCharacters(String str, String str0) {

        char[] xr = str.toCharArray();
        char[] or = str0.toCharArray();

        Set<Character> array = new TreeSet<>();
        Set<Character> array0 = new TreeSet<>();

        for (char o:xr
             ) {
            array.add(o);
        }
        for (char o : or
             ) {
            array0.add(o);
        }
        array.retainAll(array0);
        System.out.println(array);
        System.out.println(array.size());

    }
}
