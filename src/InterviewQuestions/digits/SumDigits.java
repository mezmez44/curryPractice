package InterviewQuestions.digits;

public class SumDigits {
    public static void main(String[]args){
        int nbr=145678;
        System.out.println(m(nbr));
    }
    public static int m(int nbr){
        int sum=0;
        while(nbr!=0){
            int rem=nbr%10;
             sum=sum+rem;
             nbr=nbr/10;
        }
        return sum;
    }
}
