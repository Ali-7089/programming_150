import java.util.Scanner;

public class Ques_119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPronic = false;
        for(int i=0;i<n;i++){
            if (i*(i+1)==n) isPronic = true;
        }
        if (isPronic) System.out.println("pronic number");
        else System.out.println("not pronic number");
    }
}
