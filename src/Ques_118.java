import java.util.Scanner;

public class Ques_118 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum =0,temp =n,count=0;
     int t=n;
     while(t!=0){
         count++;
         t/=10;
     }
     while(n!=0){
         sum+= Math.pow(n%10,count);
         n/=10;
         count--;
     }
     if (sum==temp) System.out.println(sum + " is a Disarium number");
     else System.out.println(sum+" is not a Disarium number");

    }
}
