import java.util.Scanner;

public class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c ) System.out.println("all are equal");
        else if(a==b || b==c ||a==c) System.out.println("any of two are equal");
    }
}
