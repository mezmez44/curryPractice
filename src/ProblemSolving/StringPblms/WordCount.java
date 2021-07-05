package ProblemSolving.StringPblms;
/*Word Count
        Have the function WordCount(str) take the str string parameter being passed and return the number of words the string contains
        (e.g. "Never eat shredded wheat or cake" would return 6).
        Words will be separated by single spaces.
        Examples
        Input: "Hello World"
        Output: 2Input: "one 22 three"
        Output: 3
        don't forget about your self
*/
public class WordCount {
    public static void main(String[] args) {
       String str=" ";
        System.out.println("the nuber of words is : " + nbrOfWords(str));
    }
    public static int nbrOfWords(String str) {
        String str1 = str.trim();
        while (!str1.isEmpty()) {
            int count = 1;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == ' ') {
                    count++;
                }
            }
            return count;
        }
       return 0;
    }
}
