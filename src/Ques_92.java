import java.util.Scanner;

public class Ques_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        double median =0;
        if (arr.length%2==1){
            median = arr[(n+1)/2-1];
        }else {
            median = arr[(n/2-1)+(n/2)]/2;
        }
        System.out.println("medain of the array " + median);
    }
}
