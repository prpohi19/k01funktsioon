//Esimene kodutöö
//Kert Liinat
import java.util.Scanner;
public class kaibemaks2{

  public static double leiaLisanduv(double alghind, double km){
    return alghind * km;
  }
  public static double leiaLoppHind(double alghind, double km){
    return alghind + leiaLisanduv(alghind, km);
  }


  public static void main(String[] arg){

      Scanner scan = new Scanner(System.in);
      Double alghind;
      System.out.println("Sisesta toote alghind: ");
      alghind = scan.nextDouble();


      Double km;
      System.out.println("Sisesta toote käibemaks protsentides: ");
      km = scan.nextDouble()/100;

      //double alghind = 31.2;
      //double km = 0.2;
      System.out.println("Alghinnale lisanduv käibemaks on " + leiaLisanduv(alghind, km) + " eurot");
      System.out.println("Lõpphinnaks kujuneb "+ leiaLoppHind(alghind, km) + " eurot");
    }
