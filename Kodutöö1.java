import java.util.Scanner;
public class Kodus {
  public static void main(String[] bussid) {
    int v_aeg, s_aeg, aegmin;

    Scanner reader = new Scanner(System.in);
    System.out.println("Sisesta väljumise tund: ");
    int v2ltund = reader.nextInt();
    System.out.println("Sisesta väljumise minut: ");
    int v2lmin = reader.nextInt();
    System.out.println("Sisesta Saabumise tund: ");
    int saabtund = reader.nextInt();
    System.out.println("Sisesta saabumise minut: ");
    int saabmin = reader.nextInt();

    v_aeg = (v2ltund*60 + v2lmin);
    s_aeg= (saabtund*60 + saabmin);
    aegmin = s_aeg - v_aeg;
    System.out.println("Buss sõidab "+aegmin/60+"h"+aegmin%60+"min");
  }

}
