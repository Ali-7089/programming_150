import java.util.Scanner;

public class Ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age>=18) System.out.println("hello " +name + ", you are a valid voter");
        else System.out.println("Sorry " + name+ ", you cant vote now but you will be eligible after " + (18-age) + " year");
    }
}
