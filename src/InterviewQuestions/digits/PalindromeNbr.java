package InterviewQuestions.digits;

public class PalindromeNbr {
    public static void main(String []args){
        int nbr =16461;
        pal(nbr);
    }
    public static void pal(int nbr){
        int orgNbr=nbr;
        int rev=0;
        while(nbr!=0){
            int rem=nbr%10;
            rev=rev*10+rem;
            nbr=nbr/10;
        }
        if(rev==orgNbr) {
            System.out.println("nbr "+ rev+" is palindrome");
        }else{
            System.out.println("nbr "+ rev+" is not palindrome");
        }
    }
}
