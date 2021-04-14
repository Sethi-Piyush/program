import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by amura on 18/2/21.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> stringStringHashMap = new LinkedHashMap<>();
        stringStringHashMap.put("Strings", "Lays");
        stringStringHashMap.put("Strings", "Mango");

        System.out.println(stringStringHashMap);
        System.out.println(stringStringHashMap.values());
        System.out.println(stringStringHashMap.keySet());

        String str = "strings";
        String str0 = "Strings";
        System.out.println(str.equals(str0));

    }


}
