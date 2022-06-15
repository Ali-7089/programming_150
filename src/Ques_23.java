import java.util.Scanner;

public class Ques_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        int dis = 0;
        if (amount>9000) dis = 30;
        else if(amount<=9000 && amount>7000) dis = 15;
        else if (amount<=7000 && amount>5000) dis = 10;
        amount = amount - ((amount*dis)/100);

        System.out.println("you have to pay " + amount);
    }
}
