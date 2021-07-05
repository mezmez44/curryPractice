package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    /**
     * given an integer number passed in the function isAPrime(number) with a help of Scanner class
     * writ a function to return all the prime numbers and tne non prime numbers separately
     * example
     * enter the number :
     * 40
     * out put :
     * prime numbers are : 2,3,5,7,11,13,17,19,23,29,31,37
     * not prime numbers are: 4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30,32,33,34,35,36,38,39,40
     * do you want to continue:
     * yes
     * Enter a number:
     * 32
     * prime numbers are : 2,3,5,7,11,13,17,19,23,29,31
     * not prime numbers are: 4,6,8,9,10,12,14,15,16,18,20,21,22,24,25,26,27,28,30,32
     * do you want to continue:
     * no
     */



    public static void main(String[]args){

        int doYouwantToContinueTheProgram;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter a number");
            int number = sc.nextInt();
            primNotPrime(number);
            doYouwantToContinueTheProgram = sc.nextInt();

        }while (doYouwantToContinueTheProgram==1);

    }


    public static void primNotPrime(int number){ // 5
        String primeNumber="", notPrimNumber="";
        int count=0;

        for (int i=1; i<=number;i++){ // number=5 / i=3
            count=0; // count=0
            for (int j=1;j<=i;j++){ // j=4 , i=4
                if (i%j==0){
                    count++;//3
                }
            }
            if (count==2){
                primeNumber=primeNumber+","+i; //2,3
            }
            if(count>2){notPrimNumber=notPrimNumber+","+i;} // 4
        }
        System.out.println(primeNumber.replaceFirst(",",""));
        System.out.println(notPrimNumber.replaceFirst(",",""));
        System.out.println("if you want to continue please enter 1 " +
                " if you don't want to continue please enter 0");
    }

    public static String primeNumber1(int start, int end){
        String primeNumber="";
        String nonprimeNumber="";

        for(int i=start;i<end;i++) {
            boolean prime=true;
            int k=2;
            while (k <= i / 2) {
                if (i % k == 0) {
                    prime = false;
                    break;
                }
                k++;
            }
            if(prime){
                primeNumber=primeNumber+","+i;
            }else{
                nonprimeNumber=nonprimeNumber+","+i;
            }
        }
        return primeNumber.replaceFirst(",","")+"\n"+nonprimeNumber.replaceFirst(",","");
    }
}
