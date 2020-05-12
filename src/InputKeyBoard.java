import java.util.Scanner;
public class InputKeyBoard {
    public static void main(String[]args){
        System.out.println("\nEnter your password below");
        String password= "celine2013";
        for(int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            String guess= sc.nextLine();
            if(!(guess.equals(password))){
                System.out.println("\nreenter your passwod");
        }else{
                System.out.println("\n3aslama");
                return;
            }

        }

    }

}
