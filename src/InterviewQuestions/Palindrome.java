package InterviewQuestions;
//*

/**
 * interview java question usbank
 * Write a function solution that, given S of length N, return any palindrome which can be
* obtained replacing all of the question marks in S by lowercase letters('a'-'z').
* if no palindrome can be obtained, the function should return "NO".
* Examples:
* 1. given S= "?ab??a", the function should return "aabbaa".
* 2. given S1= "?bab??a", the function should return "NO".
*/
public class Palindrome {
    public static void main(String []args){
        String str = "?bab??a";
        int N=0;
        System.out.println(palindrome(str,N));
    }

    public static String palindrome(String str, int N) {
        String str1 = "";
        N = str.length();
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == '?') {
                if (str.charAt(i + 1) != '?') {
                    str1 = str1 + str.charAt(i + 1);
                } else {
                    str1 = str1 + str.charAt(i - 1);
                }
            } else str1 = str1 + str.charAt(i);
        }
        int j = N-1;
        for (int k = 0; k < N / 2; k++) {
            if (str1.charAt(k) != str1.charAt(j)) {
                return "NO";
            }
            j--;
        }

        return str1;
    }
}
