package InterviewQuestions.Numbers;

public class FactorialNbr {
    /**
     *       Java Programming Java8Java Technologies. Factorial of a positive integer n
     * is the product of all values from n to 1
     * For example, the factorial of 3 is (3 * 2 * 1 = 6).
     *   6 =6*5*4*3*2*1=720
     *
     * Recursion is the technique of making a function call itself.
     * This technique provides a way to break complicated problems down into simple problems
     * which are easier to solve.
     */
    public static void main(String []args){
        int num = 6;
        int nbr = 12345;
        //System.out.println(facNum(num));
        //System.out.println(facNum1(num));
    }
    public static int facNum (int num){
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial = factorial*i;
            //System.out.println(factorial);
        }
        return factorial;
    }
    //recursion
    public static int facNum1 (int num){
        int factorial;
       if(num==1){
           return 1;
       }else{
           factorial = facNum1(num-1)*num;
           //System.out.println(factorial);
           //System.out.println(num);
       }
        return factorial;
    }




}
