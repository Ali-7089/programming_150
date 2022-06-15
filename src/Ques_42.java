import java.util.Scanner;

public class Ques_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n<=1 || n%2==0) isPrime = false;
        if (n==2) isPrime = true;
        for (int i=3;i<=Math.sqrt(n);i+=2){
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
       if (isPrime) System.out.println("Given number is prime number");
       else System.out.println("Given number is not prime number");
    }
}
