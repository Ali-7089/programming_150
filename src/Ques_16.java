import java.util.Scanner;

public class Ques_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble(), rate = sc.nextDouble(), time = sc.nextDouble();

        /* Calculate compound interest */
        double CI = (principle * (Math.pow((1 + rate / 100), time)))-principle;
        System.out.println(CI);
    }
}
