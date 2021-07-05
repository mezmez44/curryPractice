package InterviewQuestions.Numbers;

public class LargestNumber {
    public static void main(String[]args){
        int a=20;
        int b=30;
        int c=15;
        m(a,b,c);
    }
    public static void m(int a,int b,int c){
     if(a>b && a>c){
         System.out.println("the largest nbr is a = "+a);
     }else if(b>c){
         System.out.println("the largest nbr is b = "+b);
     }else{
         System.out.println("the largest nbr is c = "+c);
     }

    }
}
