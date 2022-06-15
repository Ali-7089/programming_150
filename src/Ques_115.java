import java.util.HashSet;
import java.util.Scanner;

public class Ques_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isFound = true;
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sum=0;
            while (n>0) {
                int temp1 = n % 10;
                sum += temp1 * temp1;
                n /= 10;
            }
            if(sum==1) {
                isFound = true;
                break;
            }
            else if(set.contains(sum)) {
                isFound = false;
                break;
            }
            set.add(sum);
            n=sum;
            sum=0;
        }
        if (isFound) System.out.println(true);
        else System.out.println(false);
    }
}
