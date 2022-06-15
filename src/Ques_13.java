import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender character like M or F");
        char gender = sc.nextLine().charAt(0);
        if (gender=='M' || gender=='m')System.out.println("Good morning sir !");
        else if(gender=='F' || gender=='f')System.out.println("Good morning ma'am !");
        else System.out.println("Invalid character");
    }
}
