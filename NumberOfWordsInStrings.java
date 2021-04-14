/**
 * Created by amura on 26/3/21.
 */
public class NumberOfWordsInStrings {

    public static void main(String[] args){
        lengthStrings("Uoxf ourfuo ouro uro$");
    }

    static int f;
    public static void lengthStrings(String str){
        for (int i=0;  i<str.length(); i++){
            if (str.charAt(i)==' '){
                System.out.println(f);
                f=0;
            }
            else{
                f++;
            }

        }
        System.out.println(f);

    }
}
 