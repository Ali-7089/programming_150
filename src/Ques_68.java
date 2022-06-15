import java.util.Scanner;

public class Ques_68 {
//    Second approach
 /*   public static int hcf(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a > b) return hcf(a - b, b);
        return hcf(a,b-a);
    }
  */

//    Third approach
  /*  public static int Hcf(int a,int b){
        if (b == 0) return a;
        return Hcf(b,a%b);
    }

   */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//        first approach
        int hcf = 0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) hcf = i;
        }
        System.out.println(hcf);
    }
}
