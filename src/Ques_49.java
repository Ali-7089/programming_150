import java.util.Scanner;

public class Ques_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("hello world");
            System.out.println("for recontinuing programm press any character other press 'y' and 'Y'");
            ch = sc.nextLine().charAt(0);
        }while(ch!='y' && ch!='Y');
    }
}
