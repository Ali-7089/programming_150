import java.util.Scanner;

public class Ques_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

//        first Approach
        int peakValue = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peakValue = i;
            }
        }
        System.out.println(peakValue);

//        Second Approach
        /*int first =0 , last = arr.length-1;
        while(first<last){
            int mid = first + (last-first)/2;
            if(arr[mid]<arr[mid+1])first = mid+1;
            else last = mid;
        }
        System.out.println(last);
         */
    }
}
