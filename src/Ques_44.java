import java.util.Scanner;

public class Ques_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp =n;
        int rev=0;
        while(n!=0){
            rev = (rev *10) + n%10;
            n/=10;
        }
        if (temp==rev) System.out.println("pallindrome number");
        else System.out.println("not pallindrome number");
    }
}
