import java.util.Scanner;

public class Ques_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        we are supposing that all characters in capitals or small
        int temp[] = new int[26];
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            temp[ch-97]++;
        }
        for (int i=0;i<temp.length;i++){
            if (temp[i]>0){
                System.out.println((char) (i+97)+"->"+temp[i]);
            }
        }
    }
}
