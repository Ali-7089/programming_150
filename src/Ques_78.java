import java.util.Scanner;

public class Ques_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ispallindrome=true;
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i< arr.length/2;i++){
            if (arr[i]!=arr[arr.length-1-i])ispallindrome = false;
        }
        if (ispallindrome) System.out.println("array is pallindrome");
        else System.out.println("arrays is not pallindrome");
    }
}
