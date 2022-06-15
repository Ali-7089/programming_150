import java.util.Scanner;

public class Ques_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i=0;i< arr.length;i++){
            if (min>arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println(min+" element found at "+ index);

    }
}
