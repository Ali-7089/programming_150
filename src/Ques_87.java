import java.util.Scanner;

public class Ques_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int index = -1;
        for (int i=0;i< arr.length;i++){
            if (arr[i]==k) {
                index = i;
                break;
            }
        }
        System.out.println("element found at index " + index);
    }
}
