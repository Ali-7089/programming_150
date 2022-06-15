import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num%2==0) System.out.println("given number is even number");
        else System.out.println("Given number is odd number");
    }
}
