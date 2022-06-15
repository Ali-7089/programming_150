import java.util.Scanner;

public class Ques_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter your maths's marks");
        int maths = sc.nextInt();

        System.out.println("Enter your Computer's marks");
        int computer = sc.nextInt();

        System.out.println("Enter your English's marks");
        int english = sc.nextInt();
        total = maths + computer+ english;
        double percentage = total/3;

        System.out.println("Total marks " + total);
        System.out.println("Percentage " + percentage);
     }
}
