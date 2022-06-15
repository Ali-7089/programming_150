import java.util.Scanner;

public class Ques_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isSorted=true;
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]) isSorted = false;
        }
        if (isSorted) System.out.println("array is soretd");
        else System.out.println("not soretd ");
    }
}
