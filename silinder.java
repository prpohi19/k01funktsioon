import java.util.Scanner;

public class silinder{
  public static void main(String[] arg){
    Scanner reader = new Scanner(System.in);
    System.out.println("Sisestage silindri raadius: ");
    double raadius = reader.nextDouble();
    System.out.println("Sisestage silindri kõrgus: ");
    double korgus = reader.nextDouble();
    reader.close();

    double pPindala= Math.PI * raadius * raadius;
    double kPindala= 2 * Math.PI * raadius * korgus;
    double tPindala= 2 * pPindala + kPindala;
    double ruumala = pPindala * korgus;

    System.out.format("Põhjapindala on : %.2f ruutmeetrit. \n", pPindala );
    System.out.format("Külgpindala on : %.2f ruutmeetrit. \n", kPindala );
    System.out.format("Täispindala on : %.2f ruutmeetrit. \n", tPindala );
    System.out.format("Ruumala on : %.2f kuupmeetrit. \n", ruumala);
  }
}
/* Põhjapindala on : 12.57 ruutmeetrit.
Külgpindala on : 37.70 ruutmeetrit.
Täispindala on : 62.83 ruutmeetrit.
Ruumala on : 37.70 kuupmeetrit.
*/
