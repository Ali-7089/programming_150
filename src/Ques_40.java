import java.util.Scanner;

public class Ques_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0){
            int temp = n%10;
            System.out.println(temp);
            n/=10;
        }
    }
}
