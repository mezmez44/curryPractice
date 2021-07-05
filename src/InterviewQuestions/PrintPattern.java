package InterviewQuestions;
//      Write a program to print the following pattern using for loop:
//              00 01 02 03 04 05 06 07 08 09
//              10 11 12 13 14 15 16 17 18 19
//              30 31 32 33 34 35 36 37 38 39

public class PrintPattern {
    public static void main(String[]args){

        m();

    }
    public static void m() {
        for(int i=0;i<=3;i++){
            if(i!=2){
                for(int j=0;j<=9;j++) {
                    System.out.print(i + "" + j + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
