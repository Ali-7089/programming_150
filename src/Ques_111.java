import java.util.Scanner;

public class Ques_111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        we are supposing all the characters in lowercase
        String s = sc.nextLine();
        String vowelString ="";
        String otherString="";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')vowelString+=ch;
            else otherString+=ch;
        }
        System.out.println(vowelString+otherString);
    }
}
