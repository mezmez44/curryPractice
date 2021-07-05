package ProblemSolving.Arraypblms;

import java.util.Arrays;

public class TwoSumFirstIndex {
    public static void main(String[]args){
        int[] arr = {7, 3, 5, -4, 8, 11};
twoSum(arr);

    }
    public static int [] twoSum(int []arr) {


        int firstIndex = arr[0];
        int count =0;
        int arrSize;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] + arr[i + 1] == firstIndex) {

                arr[i - 1] = arr[i];
                arr[i] = arr[i - 1];
                arr = new int[count++];
            }
            System.out.println(Arrays.toString(arr));
        }
return arr;
    }

}
