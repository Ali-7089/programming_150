import java.util.Scanner;

public class Ques_99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<nums.length;i++) nums[i] = sc.nextInt();
        
//        first Approach
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);


//        second Approach
      /*  int count =0;
        int temp[] = new int[101];
        for (int i=0;i< nums.length;i++){
            temp[nums[i]]++;
        }
        for(int i=0;i< temp.length;i++){
            count+= (temp[i]*(temp[i]-1))/2;
        }
        System.out.println(count);
       */
    }
}
