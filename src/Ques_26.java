import java.util.Scanner;

public class Ques_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ISBN = sc.nextInt();
        long rev =0;
        String s = "" + ISBN;
        if(s.length()==10){
            while(ISBN!=0){
                rev = (rev*10) + (ISBN%10);
                ISBN/=10;
            }
            int i=1 , sum=0;
            while(rev!=0){
                sum+= i*(rev%10);
                rev/=10;
                i++;
            }
            if (sum%11==0) System.out.println("Legal ISBN");
        }else System.out.println("illegal ISBN");

    }
}
