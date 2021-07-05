package ProblemSolving;

import java.util.Scanner;




class ProblemSolving {
     public static int fibona(int i){
         if (i==0) return 0;
         if (i<=2) return 1;
        int fibonacci =fibona(i-1)+fibona(i-2);
        return fibonacci;
     }

    public static void main(String[]args) {
//        int first=0,second=1,next;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter ur Fibonacci nbr:");
//        int fibNbr=sc.nextInt();
//        //01123581321
//        System.out.println(first+""+"\n"+second);
//        for(int i=2;i<fibNbr;i++){
//            next=first+second;
//            first=second;
//            second=next;
//            System.out.println(next);
//        }
        int index=0;
        while(true){
            System.out.println(fibona(index));
            index++;
        }

        }

        }


