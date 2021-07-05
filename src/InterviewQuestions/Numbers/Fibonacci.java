package InterviewQuestions.Numbers;

public class Fibonacci {
    public static void main(String[]args){
        int a=0;
        int b=1;
        m(a,b);
    }
    public static void m(int a,int b){
        int sum=0;
        System.out.print(a+" "+b);
        for(int i=0;i<8;i++){
            sum=a+b;//3
            a=b;//2
            b=sum;//3
            System.out.print(" "+sum);
        }
    }
}
