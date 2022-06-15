import java.util.Scanner;

public class Ques_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i=0;i< arr.length;i++){
            if (max<arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max+" element found at "+ index);

    }
}
