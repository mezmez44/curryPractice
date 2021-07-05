package InterviewQuestions;
/*
Sorting array. Let us consider an example of array num = { 55, 28, 121, 255, -23, 99, 76, -56 }.
 */

import java.util.Arrays;

public class ArayOrder {
    public static void main(String[]args){
        int []num={ 55, 28, 121, 255, -23, 99, 76, -56 };
        myOrderArr(num);

    }
    //Using Built in Method
    public static void myOrderArr(int[]num){
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
    //Using for loop
    public static void myOrderArr1(int[]num) {


        for (int i = 0; i < num.length; i++) {
        for(int j=i;j<num.length;j++){
            int sum=0;
            if(num[i]>num[j]){
                sum= num[i];
                num[i]=num[j];
                num[j]=sum;
            }
        }
        }
    }
}
