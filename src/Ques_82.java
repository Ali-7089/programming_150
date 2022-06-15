import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ques_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();

        //   FIRST APPROACH
       /* int num[] = new int[k];
        for(int i=0;i<num.length;i++){
            num[i] = arr[i];
        }
        for (int i=0;i<arr.length-k;i++){
            arr[i] = arr[k+i];
        }
        for (int i=0;i< num.length;i++){
            arr[k+i+1] = num[i];
        }

        for (int a:arr) System.out.print(a+" ");

        */

//        SECOND APPROACH
        for(int i=0;i<k/2;i++){
            int temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        for (int i=k;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-(i-k)];
            arr[arr.length-1-(i-k)] = temp;
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
