import java.util.Scanner;

public class Ques_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        for (int i=1;i<n;i++){
            if (n%i==0) sum+=i;
        }
        if (n==sum) System.out.println("perfect number");
        else System.out.println("not perfect number");
    }
}
