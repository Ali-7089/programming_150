import java.util.Scanner;

public class Ques_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in farenheit");
        int temp_in_faren = sc.nextInt();
        double temp_in_celcius = ((temp_in_faren-32)*5)/9;
        System.out.println(temp_in_celcius);
    }
}
