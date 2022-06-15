import java.util.Scanner;

public class Ques_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[arr.length-1];
        for (int i= arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int a:arr) System.out.print(a+" ");
    }
}
