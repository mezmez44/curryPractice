package ProblemSolving.Arraypblms;

import java.util.Arrays;

public class RemoveNegativeNumbers {
    public static class Remove_NegativeNumber {

        public static void main(String[] args) {
            int[] num = {5, 0, -2, 8, 6, 3, -10, -4, 1};
            System.out.println(Arrays.toString(positiveNum(num)));
            System.out.println(Arrays.toString(positiveNum2(num)));
        }
        public static int [] positiveNum(int [] num) {
            int count = 0;
            for(int i=0; i< num.length; i++){
                if(num[i] >=0){
                    count++;
                }
            }
            int[] newArray = new int[count];
            int j=0;
            for (int i=0; i< num.length; i++){
                if (num[i] >=0){
                    newArray[j] = num[i];
                    j++; }
            }
            return newArray;
        }

        /** Second method */
        public static int [] positiveNum2(int [] num) {
            String strNum = "";
            for (int i = 0; i < num.length; i++) {
                if (num[i] >= 0) {
                    strNum = strNum + num[i];
                }
            }

            String[] SplitStr = strNum.split("");
            int[] myArray = new int[SplitStr.length];
            int j = 0;
            for (String elm : SplitStr) {
                myArray[j] = Integer.valueOf(elm);
                j++;
            }
            return myArray;

        }
    }

}
