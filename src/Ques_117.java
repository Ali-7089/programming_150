import java.util.Scanner;

public class Ques_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        while(num!=0){
            if(num%2==0){
                num = num/2;
                count++;
            }else {
                num = num-1;
                count++;
            }
        }
        System.out.println(count);
    }
}
