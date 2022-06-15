import java.util.Locale;
import java.util.Scanner;

public class Ques_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArr = s.split(" ");
        String newStr = "";
        for(int i=0;i< strArr.length;i++){
            if (strArr[i].length()==1) newStr+=strArr[i].toUpperCase() +" ";
          else  newStr+= strArr[i].substring(0,1).toUpperCase()+strArr[i].substring(1, strArr[i].length()-1)
                   + strArr[i].substring(strArr[i].length()-1).toUpperCase() + " ";
        }
        System.out.println(newStr);
    }
}
