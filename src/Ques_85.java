import java.util.Arrays;
import java.util.Scanner;

public class Ques_85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();

        int rev[] = new int[arr.length];
        int j=0;
        for (int i= arr.length-1;i>=0;i--)rev[j++] = arr[i];

        System.out.println(Arrays.toString(rev));
    }
}
