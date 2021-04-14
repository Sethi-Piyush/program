/**
 * Created by amura on 2/2/21.
 */
public class Maximum {

    public static void main(String[] args) {
        
        int[] r = {1,2,3,4,5,6};
        
        int max0 = 0;
        int max6 = 0;

        for (int o: r
             ) {if (max0 <  o){
            max6 = max0;
            max0 = o;

        }else if (max6 < o){
            max6 = o;

        }

            System.out.println(max0);
        }
    }
}
