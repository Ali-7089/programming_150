import java.util.Scanner;

public class Ques_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first =0,second = 1;
        int n = sc.nextInt();
        System.out.print(first+ " "+ second+" ");
        for (int i=1;i<=n;i++){
            int third = first+second;
            first = second;
            second = third;
            System.out.print(third+" ");
        }
    }
}
