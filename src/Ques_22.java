import java.util.Scanner;

public class Ques_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int markes = sc.nextInt();
        String Grades = "";
        if (markes>90 && markes<=100) Grades = "AA";
        else if(markes>80 && markes<=90) Grades = "AB";
        else if(markes>70 && markes<=80) Grades = "BB";
        else if(markes>60 && markes<=70) Grades = "BC";
        else if(markes>50 && markes<=60) Grades = "CD";
        else if(markes>40 && markes<=50) Grades = "DD";
        else Grades = "F";

        System.out.println(Grades);

    }
}
