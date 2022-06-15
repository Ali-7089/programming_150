import java.util.Arrays;
import java.util.Scanner;

public class Ques_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();
        for (int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
