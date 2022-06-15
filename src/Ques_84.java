import java.util.Arrays;
import java.util.Scanner;

public class Ques_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();

//        FIRST APPROACH
        int temp[] = new int[n - d];

        // Now copying first N-D element in array temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];

        // Moving the rest element to index zero to D
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }

        // Copying the temp array element
        // in original array
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
