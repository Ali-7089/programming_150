import java.util.Scanner;

public class Ques_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),t=n,sum=0;
        while(n!=0){
            int temp = n%10;
            int fact = 1;
            for (int i=1;i<=temp;i++) fact*=i;
            sum+=fact;
            n/=10;
        }
        if (t==sum) System.out.println("strong number");
        else System.out.println("not strong number");

    }
}
