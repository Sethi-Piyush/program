/**
 * Created by amura on 5/3/21.
 */
public class SameStartEndCharactersInSubstringFind {

    public static void main(String[] args) {

        String str = "o";
        System.out.println(FindSimilar(str));
    }

    public static boolean similar(String str){
       return str.charAt(0)==str.charAt(str.length()-1);
    }

    public static int FindSimilar(String str) {
        int n = str.length();
        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n - i; j++) {
                if (similar(str.substring(i, i+j)))
                    result++;

            }
        }
        return result;
    }

}
