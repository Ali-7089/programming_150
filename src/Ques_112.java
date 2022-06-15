import java.util.Scanner;

public class Ques_112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String strArr[] = s.split(" ");
        boolean isCapital = true;
        for (int i=0;i<strArr.length;i++){
            if ((int)(strArr[i].charAt(0))>=97) {
                isCapital = false;
                break;
            }
        }

        if (isCapital) System.out.println(true);
        else System.out.println(false);
    }
}
