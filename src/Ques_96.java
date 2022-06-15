import java.util.Arrays;
import java.util.Scanner;

public class Ques_96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++) nums[i] = sc.nextInt();
        int [] ans = new int[nums.length+nums.length];
        for(int i=0;i<ans.length/2;i++){
            ans[i] =nums[i];
            ans[nums.length+i] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
