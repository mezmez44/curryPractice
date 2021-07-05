package InterviewQuestions.Numbers;
import java.util.Scanner;
public class PrimeNbrOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int nbr = sc.nextInt();
        m(nbr);
    }

    public static void m(int nbr) {
        int count =0;
    if(nbr>2){
        for(int i=1;i<=nbr;i++){
            if(nbr%i==0)
            count++;
        }if(count==2){
            System.out.println(nbr+" is prime");
        }else{
            System.out.println(nbr+" is not prime");
        }
    }else{
        System.out.println(nbr+" is not prime");
    }
    }
}