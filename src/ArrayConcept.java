import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ArrayList ar1 = new ArrayList<String>();

        int[] aghiles = {1, 2};
        //int sum=aghiles.length;

        for (int i = 0; i < aghiles.length; i++) {
            System.out.println("aghiles->" + aghiles[i]);
        }

        String[][] mez = {
                {"jsk", "mca"}, {"casa", "raja"}
        };
        System.out.println("2d array");
        System.out.println(Arrays.deepToString(mez));
        for (int i = 0; i < mez.length; i++) {
            for (int k = 0; k < mez.length; k++) {
                System.out.println(mez[i][k]);
            }

        }
        System.out.println("For each loop");
        for (String[] team : mez) {
            for (String team1 : team) {
                System.out.println(team1);
            }
        }


        Object milo[] = new Object[5];
        milo[0] = 1;
        milo[1] = "aghiles";
        System.out.println("**************");

        int raja[] = new int[10];

        for (int i = 0; i <raja.length ; i++) {
            //System.out.println(i);
            for(int k=0;k<raja.length;k++){

            }
        raja[i]=2;
        }
        System.out.println(Arrays.toString(raja));

    }
}