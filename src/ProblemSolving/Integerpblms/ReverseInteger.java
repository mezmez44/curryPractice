package ProblemSolving.Integerpblms;

public class ReverseInteger {
    public static void main(String[] args) {


//System.out.println();
        long nbr = 1092837465l;
        reverseNbr(nbr);
    }

    public static void reverseNbr(long nbr) {

        long var = 0;
        while (nbr != 0) {

            var = var * 10 + nbr % 10; //5
            nbr = nbr / 10;//
        }
        System.out.println(var);
    }

}