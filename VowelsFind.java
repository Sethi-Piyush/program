/**
 * Created by amura on 16/2/21.
 */
public class VowelsFind {

    public static void main(String[] args) {

        String str = "Fourouifo";

        char[] r = str.toCharArray();
        int o = 0;

        for (int i=0; i<r.length; i++){
            if (r[i]=='a'||r[i]=='e'||r[i]=='i'||r[i]=='o'||r[i]=='u')
                System.out.print(r[i]);
            o++;
        }

    }
}

