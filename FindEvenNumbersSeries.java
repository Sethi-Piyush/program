/**
 * Created by amura on 22/2/21.
 */
public class FindEvenNumbersSeries {

    public static void main(String[] args) {
        SeriesNumbersFindArrays();
    }

        public static void SeriesNumbersFindArrays() {
            int[] series = {1,2,8,0,8,4,2,8,0,4};
            int x = 0;
            int r = 0;

            for (int i=0; i<series.length; i++){
                if (series[i]%2!=0){
                    x=0;
                }
                else{
                    x++;
//                    System.out.println(r);
                    r = Math.max(x,r);
                }
            }
            System.out.println(r);

        }


}

