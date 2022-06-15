import java.util.Scanner;

public class Ques_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while(n!=0 || sum>9){
            if (n==0){
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        if (sum==1) System.out.println("Given number is number is X number");
        else System.out.println("Given number is not number is X number");
    }
}
