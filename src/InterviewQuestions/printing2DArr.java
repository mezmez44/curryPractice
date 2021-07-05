package InterviewQuestions;

import java.util.Arrays;
import java.util.Iterator;

public class printing2DArr {
    /*
    Let us consider a 2D array arr[3][3] = { {10, 20, 30} , {40, 50, 60} , {70, 80, 90}}.
     */
    public static void main(String[]args){
        int [][]arr= {{10, 20, 30},{40, 50, 60},{70, 80, 90}};
        m3(arr);
    }
    public static void m(int[][]arr){
        int row =arr.length;
        System.out.println(row);
        int col= arr[row-1].length;
        System.out.println(col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }

        }
    }
    public static void m1(int[][]arr){
        int row =arr.length;
        System.out.println(row);
        int col= arr[row-1].length;
        System.out.println(col);
        for(int[] i: arr){
            for(int y: i){
                System.out.print(y+" ");
            }
        }
    }
    public static void m2(int[][]arr){
        System.out.println(Arrays.deepToString(arr));
    }
    public static void m3(int[][]arr){
        for(int [] row:arr){
            System.out.print(Arrays.toString(row));
        }
    }
}
