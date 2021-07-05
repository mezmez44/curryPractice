package InterviewQuestions.Strings;

public class PalindromeStr {
    public static void main(String[]args){
        String str ="madam";
        m(str);
    }
    public static void m(String str){
        String str2 ="";
        for(int i=str.length()-1;i>=0;i--) {
            str2 = str2 + str.charAt(i);
        }
            if(str2.equalsIgnoreCase(str)){
                System.out.println(str+" is palindrome");
            }else{
                System.out.println(str+" is not palindrome");

        }

    }

}
