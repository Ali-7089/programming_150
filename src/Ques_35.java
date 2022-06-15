import java.util.Scanner;

public class Ques_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_range = sc.nextInt(),second_range = sc.nextInt() , evenSum=0,oddSum=0;
        for (int i=first_range;i<=second_range;i++){
           if (i%2==0) evenSum+=i;
           else oddSum+=i;
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
