import java.util.Scanner;

class küpsisetort1{
  public static void main(String[] arg){
    Scanner küpsised = new Scanner(System.in);
    int Inum, IInum, IIInum, IVnum, Vnum, VIpakki, jääk;
    System.out.println("Mitu küpsist on sinu tort lai? ");
    Inum = küpsised.nextInt();
    System.out.println("Mitu küpsist on sinu tort pikk? ");
    IInum = küpsised.nextInt();
    System.out.println("Mitu küpsiste kihti on sinu tordil? ");
    IIInum = küpsised.nextInt();
    System.out.println("Mitu küpsist on on ühes pakis? ");
    Vnum = küpsised.nextInt();

    IVnum = Inum * IInum * IIInum;
    System.out.println("Kokku läheb vaja " + IVnum + " küpsist. ");

    VIpakki = IVnum / Vnum;
    
    //kas mõni küpsis jääb ka järgi?
    jääk = IVnum % Vnum;
    System.out.println("Järgi jääb " + jääk + " küpsist. ");

    if(jääk != 0) {
      VIpakki = VIpakki + 1;
      System.out.println("Meil läheb vaja " + VIpakki + " küpsisepakki. "); }
    else {
      System.out.println("Meil läheb vaja " + VIpakki + " küpsisepakki. "); }
  }
}
