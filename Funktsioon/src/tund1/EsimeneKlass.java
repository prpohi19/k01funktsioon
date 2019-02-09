package tund1;

import java.util.Scanner;

public class EsimeneKlass {
    public static String bmi(int sisend){

        Scanner input1 = new Scanner(System.in);
        System.out.println("Sisesta kehakaal (kg): ");
        int kaal = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Sisesta pikkus (cm): ");
        int pikkus = input2.nextInt();

        double massiIndeks = kaal / (pikkus / 100.0 * pikkus / 100.0);

        System.out.println("Kehakaal =  " + kaal + "\nPikkus = " + pikkus + "\n\nSinu kehamassiindeks on " + Math.round(massiIndeks));

        if (massiIndeks < 18) {System.out.println("Olete alakaalus.");}
        if (18 <= massiIndeks && massiIndeks < 25) {System.out.println("Olete normaalkaalus.");}
        if (massiIndeks >= 25) {System.out.println("Olete ülekaalus.");}

        return  "";

    }
}
