import java.util.Scanner;

public class Ques_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),temp=n,sum=0;
//        part 01
       while(n!=0){
            sum += Math.pow(n%10,3);
            n/=10;
        }
        if (temp==sum) System.out.println("armstrong number");
        else System.out.println("not armstrong number");

//        part 02
    /*    int count =0,t=n;
        while (t-->0) {
            count++;
            t/=10;
        }
        while(n!=0){
            sum += Math.pow(n%10,count);
            n/=10;
        }
        if (temp==sum) System.out.println("armstrong number");
        else System.out.println("not armstrong number");

     */
    }
}
