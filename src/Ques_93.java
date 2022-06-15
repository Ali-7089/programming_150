import java.util.Scanner;

public class Ques_93 {
    public static int isStrong(int n){
        int sum=0;
        while(n!=0){
            int t = n%10;
            int fact =1;
            for(int i=1;i<=t;i++)fact*=i;
            sum+=fact;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==isStrong(n)) System.out.println("strong number");
        else System.out.println("not strong number");
    }
}
