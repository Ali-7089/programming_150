import java.util.Scanner;

public class Ques_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ISBN = sc.nextInt();
        int sum =0;
        String s = "" + ISBN;
        int len = s.length();
        if(s.length()==10){
            while(ISBN!=0){
                sum +=  len-- *(ISBN%10);
                ISBN/=10;
            }
            if (sum%11==0) System.out.println("Legal ISBN");
            else System.out.println("Illegal ISBN");
        }else System.out.println("illegal ISBN");
    }
}
