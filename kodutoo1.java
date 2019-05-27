//test
import java.util.Scanner;

public class kodutoo1{
    public static void main(String[] arg){
        double summa = 0;
        System.out.println("kb/mb/gb converter");
        Scanner scan = new Scanner(System.in);
        System.out.println("mida soovid convertida? 1. byte 2. kb 3. mb");
        int mida = scan.nextInt();
        System.out.println("milleks soovid convertida? 1. byte 2. kb 3. mb");
        int milleks = scan.nextInt();
        System.out.println("Mis kogust soovite convertida?");
        int palju = scan.nextInt();
        if (mida == milleks){
            System.out.println(palju);
        } else if (mida == 1 && milleks == 2) {
            summa = palju/1024;
            System.out.println(summa);
        } else if (mida == 1 && milleks == 3) {
            summa = palju/1048576;
            System.out.println(summa);
        } else if (mida == 2 && milleks == 1) {
            summa = palju*1024;
            System.out.println(summa);
        } else if (mida == 2 && milleks == 3) {
            summa = palju/1024;
            System.out.println(summa);
        } else if (mida == 3 && milleks == 1) {
            summa = palju*1048576;
            System.out.println(summa);
        } else if (mida == 3 && milleks == 2) {
            summa = palju/1024;
            System.out.println(summa);
        } else {
            System.out.println("Vale sisend!");
        }
    }
}
