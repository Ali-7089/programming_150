import java.util.Scanner;

public class Ques_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neg_sum = 0, evev_sum = 0, odd_sum = 0;
        while (true) {
            System.out.println("Enter Numbers:");
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }
            if (n < 0) {
                neg_sum += n;
            }
            else if (n % 2 == 0) {
                evev_sum += n;
            }
            else {
                odd_sum += n;
            }
        }

        System.out.println("Negative No. Sum = " + neg_sum);
        System.out.println("Positive Even No. Sum = " + evev_sum);
        System.out.println("Positive Odd No. Sum = " + odd_sum);

    }
}
