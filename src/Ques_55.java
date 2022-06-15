import java.util.Scanner;

public class Ques_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0,ex,option,n;
        do{
            System.out.println("Press 1.Indian 2.Chinese 3.Italian");
            n = sc.nextInt();
            switch (n){
                case 1->{
                    System.out.println("Press 1.chole-bhature 2.paneer-kulche");
                    option = sc.nextInt();
                    switch (option){
                        case 1-> total +=150;
                        case 2->total +=200;
                    }
                }
                case 2->{
                    System.out.println("Press 1.Noodles 2.DRy-Manchurian");
                    option = sc.nextInt();
                    switch (option){
                        case 1-> total +=100;
                        case 2->total +=150;
                    }
                }
                case 3->{
                    System.out.println("Press 1.Pizza 2.Caprese Salad");
                    option = sc.nextInt();
                    switch (option){
                        case 1-> total +=250;
                        case 2->total +=60;
                    }
                }
            }
            System.out.println("want to continue programm? 1.Yes 2.No");
            ex = sc.nextInt();
        }while(ex!=2);
        System.out.println("total bill = "+total);
    }
}
