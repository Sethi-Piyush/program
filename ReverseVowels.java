/**
 * Created by amura on 16/2/21.
 */
public class ReverseVowels {
    public static void main(String[] args) {
        String str = "iourf ourfo";
        // uourf oirf
        System.out.println(reverseVowels(str));

    }
    public static boolean isVowel(char o){
        if (o=='a'|| o=='e' || o=='i' || o=='o' || o=='u'){
            return true;
        }
        return false;
    }
    public static String reverseVowels(String str){
        int i = 0;
        int j = str.length()-1;

        char[] rr = str.toCharArray();

        while(i<j){
            if (!isVowel(rr[i])){
                i++;
                continue;
            }
            else if(!isVowel(rr[j])){
                j--;
                continue;
            }

            char or = rr[i];
            rr[i] = rr[j];
            rr[j] = or;

            i++;
            j--;

        }
        return String.valueOf(rr);
    }

}
