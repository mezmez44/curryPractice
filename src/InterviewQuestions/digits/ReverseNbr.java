package InterviewQuestions.digits;

public class ReverseNbr {
    public static void main(String[]args){
        int nbr = 12345;
        System.out.println(revnbr(nbr));
        //System.out.println(revnbr1(nbr));

    }

    public static int revnbr(int nbr){

        int rev=0 ;
        while(nbr!=0){
            rev = rev *10+nbr%10;
            nbr=nbr/10;


        }
        return rev;
    }
    //using StringBuffer
    public static int revnbr1(int nbr){
        int revstrb =0;
        StringBuffer strb= new StringBuffer();
        strb.append(nbr).reverse();
        revstrb = Integer.parseInt(strb.toString());
        return revstrb;
    }
}
