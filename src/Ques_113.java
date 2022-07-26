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
            if (ch>='a' && ch<='z') temp1[ch-97]++;
            else if(ch>='A' && ch<='Z') temp1[ch-65]++;
        }
        for (int i=0;i<second.length();i++){
            char ch = second.charAt(i);
            if (ch>='a' && ch<='z') temp2[ch-97]++;
            else if(ch>='A' && ch<='Z') temp2[ch-65]++;
        }
        if (Arrays.equals(temp1,temp2)) System.out.println("anagram");
        else System.out.println("not anagram");
    }
}
