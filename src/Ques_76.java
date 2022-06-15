import java.util.Scanner;

public class Ques_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int firstGreatest = Math.max(arr[0],arr[1]);
        int secondGreatest = Math.min(arr[0],arr[1]);

        for (int i=0;i< arr.length;i++){
            if (firstGreatest<arr[i]) {
                secondGreatest = firstGreatest;
                firstGreatest = arr[i];
                index = i;
            }else if(secondGreatest<arr[i] && secondGreatest!=firstGreatest){
                secondGreatest = arr[i];
                index = i;
            }
        }
        System.out.println(secondGreatest+" element found at "+ index + " index");
    }
}
