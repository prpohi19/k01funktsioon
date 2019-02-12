import java.util.Scanner;
public class Lahendus2 {
//Programm aitab convertida kilowatte ja hobujõude.
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sisesta mida taha convertida(HP=0;KW=1): ");
        int midaconv = reader.nextInt();
        System.out.println("Sisesta võimsus: ");
        int v6imsus = reader.nextInt();
        reader.close();
        if(midaconv==1){
            double tulemus=v6imsus*1.341;
            System.out.println(v6imsus+" Kilowatti on "+tulemus+"Hobuj6udu.");
        }
        if(midaconv==0){
            double tulemus=v6imsus/1.341;
            System.out.println(v6imsus+" Hobujõudu on "+tulemus+" Kilowatti.");
        }
    }
}
