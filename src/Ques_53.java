import java.util.Scanner;

public class Ques_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char ch = sc.nextLine().charAt(0);
        switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U'-> System.out.println("Given alphabet is vowel");
            default -> System.out.println("Given alphabet is consonent");
        }
    }
}
