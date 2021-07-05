package InterviewQuestions;

public class PairNumber {
    /**
     * Input:
     * arr=[1,2,3,4,5,6,7,8,9]
     * x = 10
     *
     * Find the pairs, which makes x
     * Example Output: 1+9 = 10
     * 2+8 =10 etc
     * Write a method to find pairs and return them.
     */
    public static void main(String[]args){
        int []arr ={1,2,3,4,5,6,7,8,9};
        System.out.println(pair(arr));
    }
    public static String pair(int []arr){
        int x =10;
        String str ="";
        for(int i=0;i<arr.length;i++){
          for(int k=arr.length-1;k>i;k--){
              if(arr[i]+arr[k]==x){
              str = str+" "+arr[i] +","+arr[k];
              }
          }
        }
        return str;
    }



}
