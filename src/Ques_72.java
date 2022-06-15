import java.util.Scanner;

public class Ques_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s ="";int sum=0;
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if (i==arr.length-1){
                s+=arr[i];
                sum+=arr[i];
            }else {
                s+=arr[i]+ " + ";
                sum+=arr[i];
            }
        }
        System.out.println(s+" = "+sum);
    }
}
