package InterviewQuestions.digits;

public class CountDigits {
    public static void main(String[]args){
        int nbr =145678;
        System.out.println("number of digits "+digitsNbr(nbr));
    }
    public static int digitsNbr(int nbr){
        int count=0;
        while(nbr!=0){
            nbr=nbr/10;
            count++;
        }
        return count;
    }
}
