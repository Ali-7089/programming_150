import java.util.Arrays;
import java.util.Scanner;

public class Ques_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++) nums[i] = sc.nextInt();
        int [] shuffledArray = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length/2;i++){
            shuffledArray[j] = nums[i];
            shuffledArray[j+1] = nums[n+i];
            j+=2;
        }
        System.out.println(Arrays.toString(shuffledArray));
    }
}
