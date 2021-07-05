package InterviewQuestions;

import java.util.Arrays;

public class ArrayAddition {
   /* Array Addition I
    Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
    and return the string true if any combination of numbers in the array
            (excluding the largest number) can be added up to equal the largest number
    in the array, otherwise return the string false. For example:
            if arr contains [4, 6, 23, 10, 1, 3] the output should
return true because 4 + 6 + 10 + 3 = 23. The array will not be empty,
    will not contain all the same elements, and may contain negative numbers.
            Examples
    Input: new int[] {5,7,16,1,2}
    Output: false
    Input: new int[] {3,5,-1,8,12}
    Output: true
    Input: new int[] {4,6,23,10,3}
    Output: true

    */
    public static void main(String[]args) {
        int[] arr = {4, 6, 23, 10, 1, 3};
        System.out.println(arrAdd(arr));
    }
        public static String arrAdd(int[]arr){
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int leng=arr.length;
            int target =arr[leng-1];
            for(int i=0;i<leng-1;i++){
                int sum=0;
                for(int j=i;j<leng-1;j++){
                    sum=sum+arr[j];
                    if(sum>=target){
                        System.out.println(sum);
                        return "true";
                    }
                }
            }
            return "false";
        }

}
