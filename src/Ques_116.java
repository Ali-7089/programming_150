import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques_116 {
    public static boolean isSelf(int n){
        int temp = n;
        while(n!=0){
            int rem = n%10;
            if(rem==0) return false;
            else if(temp%rem!=0) return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt(),right = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelf(i))list.add(i);
        }
        System.out.println(list);
    }
}
