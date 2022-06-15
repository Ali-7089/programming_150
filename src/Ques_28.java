import java.util.Scanner;

public class Ques_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b= sc.nextInt();
//       first way
        int t = a;
        a=b;
        b=t;

//        second way
        /* a=a+b;
        b=a-b;
        a=a-b;

         */
        System.out.println(a);
        System.out.println(b);
    }
}
