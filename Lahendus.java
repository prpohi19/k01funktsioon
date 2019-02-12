import java.util.Scanner;
public class Lahendus{
    public static void main(String[] arg){

        int pudelid=3;

        Scanner reader = new Scanner(System.in);
        System.out.println("Sisesta joogipudelite arv mille oled 2ra joonud: ");
        int joodudpudelid = reader.nextInt();
        reader.close();
        if (pudelid<=joodudpudelid){
            System.out.println("Mine poodi joogi j2rgi.");

        } else {
            int alles = pudelid - joodudpudelid;
            System.out.println("Sul on alles "+alles+" pudelit jooki.");
        }
    }
}