package InterviewQuestions.digits;

public class CountDigitsEvenOdd {
    public static void main(String[]args){
        int nbr=145678;
        m(nbr);

    }
    public static void m(int nbr){
        int counteven=0;
        int countodd=0;
        int rem;
        while(nbr!=0){
            rem=nbr%10;
            int digit=rem%2;
           nbr = nbr/10;
           if(digit==0) {
               System.out.println(rem + " is even");
               counteven++;

           }else {
               System.out.println(rem + " is odd");
               countodd++;
           }
        }
        System.out.println("nbr of even "+counteven+"\n"+"nbr of odd "+countodd);

    }
}
