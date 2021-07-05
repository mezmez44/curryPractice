package InterviewQuestions.Numbers;

public class SwappingNumbers {
    public static void main(String[]args){
        int a=10;
        int b= 20;
        System.out.println(m(a,b));
        System.out.println("************");
        System.out.println(m1(a,b));
        System.out.println("************");
        System.out.println(m2(a,b));
        System.out.println("************");
        System.out.println(m3(a,b));
    }
    //Using a third variable
    public static String m(int a,int b) {
        int c=0 ;
         c=c+a;
         a=b;
         b=c;
         return "a = "+a+"\n"+"b = "+b;
    }
    //Using + and _ Operators
    public static String m1(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return "a= "+a+"\n"+"b= "+b;
    }
    //Using * and / Operators
    public static String m2(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;
        return "a = "+a+"\n"+"b = "+b;
    }
    //Swaping in a single Statement
    public static String m3(int a,int b){
        b = b+a -(a=b);
        return "a= "+a+"\n"+"b= "+b;
    }
}
