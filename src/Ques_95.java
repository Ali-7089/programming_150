import java.util.Scanner;

public class Ques_95 {
    public static boolean isPrime(int n){
        if (n<=1) return false;
        if (n==2) return true;
        if(n%2==0) return false;
        for (int i=3;i<=Math.sqrt(n);i+=2){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) System.out.println("Given number is prime number");
        else System.out.println("Given number is not prime number");
    }
}
