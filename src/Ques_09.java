import java.util.Scanner;

public class Ques_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        int simple_interest = (principle*rate*time)/100;
        System.out.println(simple_interest);
    }
}
