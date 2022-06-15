import java.util.Scanner;

public class Ques_114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String newStr="";
        String strArr[] = s.split(" ");
        for (int i=0;i<strArr.length-1;i++){
            for (int j=0;j<strArr.length-1-i;j++){
                if (strArr[j].compareTo(strArr[j+1])>0){
                    String temp = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = temp;
                }
            }
        }
        for (int i=0;i< strArr.length;i++){
            newStr += strArr[i]+" ";
        }
        System.out.println(newStr);
    }
}
