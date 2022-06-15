import java.util.Scanner;

public class Ques_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int no2000=0,no500=0,no200=0,no100=0,no50=0,no20=0,no10=0,no5=0,no2=0,no1=0;
        if(amount>=2000){
            no2000 = amount/2000;
            amount = amount%2000;
        }
        if(amount>=500){
            no500 = amount/500;
            amount = amount%500;
        }
        if(amount>=200){
            no200 = amount/200;
            amount = amount%200;
        }
        if(amount>=100){
            no100 = amount/100;
            amount = amount%100;
        }
        if(amount>=50){
            no50 = amount/50;
            amount = amount%50;
        }if(amount>=20){
            no20 = amount/20;
            amount = amount%20;
        }if(amount>=10){
            no10 = amount/10;
            amount = amount%10;
        }
        if(amount>=5){
            no5 = amount/5;
            amount = amount%5;
        }if(amount>=2){
            no2 = amount/2;
            amount = amount%2;
        }
        no1 = amount;

        System.out.println("no of 2000 note is " + no2000);
        System.out.println("no of 500 note is " + no500);
        System.out.println("no of 200 note is " + no200);
        System.out.println("no of 100 note is " + no100);
        System.out.println("no of 50 note is " + no50);
        System.out.println("no of 20 note is " + no20);
        System.out.println("no of 10 note is " + no10);
        System.out.println("no of 5 note is " + no5);
        System.out.println("no of 2 note is " + no2);
        System.out.println("no of 1 note is " + no1);
    }
}
