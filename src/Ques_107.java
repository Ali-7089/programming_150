import java.util.Arrays;
import java.util.Scanner;

public class Ques_107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(" ");
        for(int i=0;i< strArr.length;i++){
            System.out.println(strArr[i].substring(0,1).toUpperCase()+strArr[i].substring(1));
        }
    }
}
