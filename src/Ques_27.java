import java.util.Scanner;

public class Ques_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'u' ||
                a == 'o' || a == 'i' || a == 'e') System.out.println("Given alphabet is vowel");
        else System.out.println("Given alphabet is consonent");
    }
}
