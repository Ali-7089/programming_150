import java.util.Scanner;

public class Ques_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
          char ch = s.charAt(i);
          if (ch>='A' && ch<='Z') s1+= (char)(ch+32);
          else if (ch>'a' && ch<='z') s1+=(char)(ch-32);
        }
        System.out.println(s1);
    }
}
