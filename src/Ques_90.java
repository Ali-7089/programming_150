import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques_90 {
    public static void swap(int[] ar, int i, int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();
        int low =0,high = arr.length-1;
        while (low<=high){
            if (arr[low]<=0)low++;
            else {
                swap(arr,low,high--);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
