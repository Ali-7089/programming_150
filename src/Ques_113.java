import java.util.Arrays;
import java.util.Scanner;

public class Ques_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        int temp1[] = new int[26];
        int temp2[] = new int[26];
        for (int i=0;i<first.length();i++){
            char ch = first.charAt(i);
            temp1[ch-97]++;
        }
        for (int i=0;i<second.length();i++){
            char c = second.charAt(i);
            temp2[c-97]++;
        }
        if (Arrays.equals(temp1,temp2)) System.out.println("anagram");
        else System.out.println("not anagram");
    }
}
