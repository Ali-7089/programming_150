import java.util.Scanner;

public class Ques_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String quad_equ = a+"x^2 +"+b+"x +" + c;
        System.out.println(quad_equ);

        double disc = (int)(Math.pow(b,2) - 4*a*c);
        if(disc>0){
            System.out.println((-b + Math.sqrt(disc))/(2*a));
            System.out.println((-b - Math.sqrt(disc))/(2*a));
        }else{
            System.out.println("Not possible");
        }
    }
}
