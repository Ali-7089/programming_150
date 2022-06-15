import java.util.Scanner;

public class Ques_69 {
//    Second Approach
   /* public static int hcf(int a , int b){
        if(b==0) return a;
        return hcf(b,a%b);
    }

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

//        FIRST APPROACH
        int lcm = 0,hcf=0;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if(num1%i==0 && num2%i==0) hcf=i;
        }
        lcm = (num1*num2)/hcf;
        System.out.println(lcm);

//        System.out.println((num1*num2)/hcf(num1,num2));
    }
}
