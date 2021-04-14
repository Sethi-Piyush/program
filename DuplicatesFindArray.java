/**
 * Created by amura on 2/2/21.
 */
public class DuplicatesFindArray {
    public static void main(String[] args) {

//        int[] r = new int[]{1,2,2,3,4,0,4,5,6,5};
//        int[] r = {1,2,3,4,5,0,6,4};
        int[] r = new int[]{1,2,3,4,5,5,6,0,6};
        System.out.println("Duplicate elements are:");

        int o=0;
        for (int i=0; i<r.length; i++){
            for (int j=i+1; j<r.length; j++){
                if (r[i] == r[j]){
                    System.out.print(r[j] + " " );
                    o++;
                }
            }
        }
        System.out.println();
        System.out.println("Number of duplicates are:" + o);
    }
}



