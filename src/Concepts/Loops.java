package Concepts;

import java.util.Scanner;
public class Loops {

    public static void main(String[]args){
        //while
//        System.out.println("\nguess the password:");
//        String password="celine";
//        Scanner sc =new Scanner(System.in);
//        String guess = sc.next();
//        int i=1;
//        while(!(guess.equals(password))&& i<3){
//            System.out.println("reenter the password");
//             guess = sc.next();
//             i++;
//        }
        //do while
//        Scanner scanner = new Scanner(System.in);
//        String passcode="celine";
//        String inputPassword;
//        do{
//            System.out.println("Enter your password:");
//            inputPassword=scanner.next();
//
//        } while(!(passcode.equals(inputPassword)));
//        System.out.println("welcome");

        //for loops

//        for(int i=9;i>=0;i--){
//            for (int j = i; j >=0 ; j--) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
        for (int i = 10; i >=0 ; i--) {
            if(!(i==i/2)){
                System.out.println(i);
            }

        }

    }
}
