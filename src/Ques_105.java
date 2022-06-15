import java.util.Scanner;

public class Ques_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countOfVowel =0,countOfConsonent=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
//            we are supposing all characters in small
            if (ch>='a' && ch<='z'){
                if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' )countOfVowel++;
                else countOfConsonent++;
            }
        }
        System.out.println("Count of vowel "+ countOfVowel);
        System.out.println("Count of consonent " +countOfConsonent);
    }
}
