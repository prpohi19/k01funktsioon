import java.util.Scanner;

public class kolmnurk{
  public static void main(String[] arg){
    //Tekitab scanneri ning kysib kasutajalt esimest ning teist kaatetit.
    Scanner reader = new Scanner(System.in);
    System.out.println("Sisestage esimene kaatet.");
    float kaatet1 = reader.nextFloat();
    System.out.println("Sisestage teine kaatet.");
    float kaatet2 = reader.nextFloat();
    reader.close();
    //Arvutab hypotenuusi.
    float k1ruudus = kaatet1 * kaatet1;
    float k2ruudus = kaatet2 * kaatet2;
    double hypotenuus = Math.sqrt((k1ruudus) + (k2ruudus));
    System.out.println("Hüpotenuus on :" + hypotenuus);
    //Arvutab pindala.
    double pindala = ((kaatet1 * kaatet2) / 2);
    System.out.println("Pindala on :" + pindala);
    //Arvutab ymbermoodu.
    double ymbermoot = (kaatet1 + kaatet2 + hypotenuus);
    System.out.println("Ümbermõõt on :" + ymbermoot);
  }
}
