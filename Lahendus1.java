//Kodutöö põhineb palga arvutamisel
import java.util.Scanner;
import java.lang.Math;

public class Calc {

    public static double kulu_tooandjale(int bruto){
            double kulu = bruto+(bruto*0.33)+(bruto*0.008);
        return kulu;
    }

    public static double leiaNetopalk(int bruto) {
            double palk = bruto;
            //Arvutab palgast maha töötuskindlustuse ja kogumispensioni
            palk = palk - (palk * 0.02) - (palk * 0.016);
            //Määrab, kas tulumkasuvabastus on 500 või vähem
            if (bruto <= 1200) {
                //Arvutab palgast maha tulumaksu
                palk = ((palk-500)*0.8)+500;
            } else if (bruto <= 2100){
                double maksuvabatulu = (6000 - (6000.0/10800*(bruto*12-14400)))/12;
                System.out.println(maksuvabatulu);
                palk = ((palk-maksuvabatulu)*0.8)+maksuvabatulu;
            } else {
                palk = (palk*0.8);
            }
            return palk;
        }

        public static void main(String[] arg){
            Scanner reader = new Scanner(System.in);
            System.out.print("Sisesta keskmine bruto kuupalk: ");

            int bruto = reader.nextInt();

            System.out.println("Netopalk: "+Math.round(leiaNetopalk(bruto) * 100.0) / 100.0+" eurot");
            System.out.println("Tööandjale kulu kokku: "+Math.round(kulu_tooandjale(bruto) * 100.0) / 100.0+" eurot");
        }

}

/*Näitjuhud ja tulemused
Bruto: 654, Neto: 604.37, Tööandja kulu: 875.05
Bruto: 1500, Neto 1223.47, Tööandja kulu: 2007.00
Bruto: 5600, Neto: 4318.72, Tööandja kulu 7492.80
 */
