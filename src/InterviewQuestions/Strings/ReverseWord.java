package InterviewQuestions.Strings;

public class ReverseWord {
    /**
     * Reverse the position of Words of the the given String str ="I love Programming" without reversing each word
     */
    public static void main(String[]args){
        String str="I love Programming";
        System.out.println(reversePosition(str));
    }
    public static String reversePosition(String str){
        String [] str1=str.split(" ");
        String str2="";
        for(int i=str1.length-1;i>=0;i--){
            str2=str2+str1[i]+" ";
        }
       return str2;
    }
}
