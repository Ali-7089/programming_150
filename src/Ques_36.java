import java.util.Scanner;

public class Ques_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_range = sc.nextInt(),second_range = sc.nextInt();
        for (int i=first_range;i<=second_range;i++){
            if (i%3==0 || i%5==0) System.out.println(i);
        }
    }
}
