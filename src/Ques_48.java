import java.util.Scanner;

public class Ques_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), count =0,t=n, temp=n;
        int sq = n*n;
        while (t-->0) {
            count++;
            t/=10;
        }
        if (temp== sq % (int)Math.pow(10,count)) System.out.println("automorphic number");
        else System.out.println("not automorphic number");

    }
}
