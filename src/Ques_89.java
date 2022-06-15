import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ques_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++)arr[i] = sc.nextInt();

        for(int i=0;i< arr.length;i++)if(arr[i]>=0)list1.add(arr[i]);

        for(int i=0;i< arr.length;i++)if(arr[i]<0)list2.add(arr[i]);

        int j=0;
        for (int i=0;i< list1.size();i++)arr[j++] = list1.get(i);

        for (int i=0;i< list2.size();i++)arr[j++] = list2.get(i);

        System.out.println(Arrays.toString(arr));


    }
}
