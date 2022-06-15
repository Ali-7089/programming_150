import java.util.Scanner;

public class Ques_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPallindrome = true;
        char charArray[] = s.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                isPallindrome = false;
        }
        if (isPallindrome) System.out.println("Given string is pallindrome");
       else  System.out.println("Given string is not pallindrome");
    }
}
