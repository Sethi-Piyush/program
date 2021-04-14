import java.util.regex.Pattern;

/**
 * Created by amura on 3/2/21.
 */
public class ReverseStrings {

    public static void main(String[] args) {

//
//        String str = "Strings methods";
////        // Using StringBuilder
//        StringBuilder r = new StringBuilder();
//        r.append(str);
//        r = r.reverse();
//        System.out.println(r);
//
////        Using toCharArray
//        char[] x = str.toCharArray();
//        for (int i = x.length - 1; i >= 0; i--) {
//            System.out.print(x[i]);
//        }
        String ox = "Strings methods";
        System.out.println(reversedStrings(ox));

    }

    // Reverse words in strings
    public static String reversedStrings(String str){
//        Pattern patterns = Pattern.compile("\\s+");
//        String r[] = patterns.split(str);
        String[] r = str.split("\\s+");
        System.out.println(r.length);
        String reversed= " ";
        for (int i=r.length-1; i>=0; i--) {
            System.out.print(" " + r[i]);

        }

//        for (int i=0; i<r.length; i++){
//            if (i==r.length-1){
////                System.out.println("Reversed 0:" + reversed); // Strings
//                reversed = r[i] +  " " + reversed; // methods + Strings
////                System.out.println("Reversed:" +  reversed); // methods Strings
//            }
//            else
//                reversed = r[i];
////            System.out.println("Reversed else string:" + reversed); // Strings
////            System.out.println("r[i]:" + r[i]); // Strings
//        }
        return reversed; // method Strings
    }
}
