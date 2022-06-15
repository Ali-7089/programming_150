import java.util.Scanner;

public class Ques_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length");
        int length = sc.nextInt();

        System.out.println("Enter your breadth");
        int breadth = sc.nextInt();

        int area_of_rectangle = length * breadth;
        int per_of_rectangle = 2 * (length + breadth);

        System.out.println("area of reactanle " + area_of_rectangle);
        System.out.println("perimeter of rectangle "+ per_of_rectangle);
    }
}
