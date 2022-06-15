import java.util.Scanner;

public class Ques_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0,temp = n;
        while(n!=0){
            sum += n%10;
            n/=10;
        }
        if (temp%sum==0) System.out.println("harshad number");
        else System.out.println("not harshad number");

    }
}
