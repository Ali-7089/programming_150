import java.util.Scanner;

public class Ques_110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int firstString=0;
        int SecondString=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i<s.length()/2){
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
                        ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') firstString++;
            }else{
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||
                        ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U') SecondString++;
            }
        }
        if (firstString==SecondString) System.out.println(true);
        else System.out.println(false);
    }
}
