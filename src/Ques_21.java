import java.util.Scanner;

public class Ques_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isleapYear = false;
//        first method
        if (year%4==0){
            isleapYear = true;
            if (year%100==0) {
                if (year%400==0)isleapYear = true;
            }
        }else isleapYear = false;

        if (isleapYear) System.out.println("leap year");
        else System.out.println("not leap year");

//        second way
      /*  if ((year%4==0 && year!=0)|| year%400==0 ) System.out.println("leap year");
        else System.out.println("not leap year");
       */
    }
}
