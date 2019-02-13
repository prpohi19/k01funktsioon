import java.util.Scanner;

public class Main {
    // Unix-i laadsete õiguste arvu viisard kaustadele ja failidele
    // Inspiratsioon: http://permissions-calculator.org/

    private static int notation = 0;
    private static String line;

    private static String leaveEmpty = " (võib tühjaks jätta)";
    private static String leaveEmpty1 = leaveEmpty;
    private static String leaveEmpty2 = leaveEmpty;
    private static String leaveEmpty3 = leaveEmpty;

    private static String setuid = "u";
    private static String setgid = "g";
    private static String stickybit = "t";

    private static void appendNumber(String character, int append){ // Lisab arve, loomaks kaheksandiksüsteemis väljund
        if (line.toLowerCase().contains(character))
        {
            notation += append;
        }
    }

    private static void appendWarnings(){ // Lisab tähiste järgi hoiatusi
        if (line.toLowerCase().contains(setuid))
        {
            leaveEmpty1 = " (setuid töötamiseks tuleb execute määrata)";
        }
        else if (line.toLowerCase().contains(setgid))
        {
            leaveEmpty2 = " (setgid töötamiseks tuleb execute määrata)";
        }
        else if (line.toLowerCase().contains(stickybit))
        {
            leaveEmpty3 = " (sticky bit töötamiseks tuleb execute määrata)";
        }
    }

    public static void main(String[] args) {

        String read = "r";
        String write = "w";
        String execute = "x";

        Scanner scan = new Scanner(System.in);

        System.out.println("Tere tulemast chmod-generaatorisse!");
        System.out.println("Palun sisesta soovitud spetsiaalsed tähised:");
        System.out.println("setuid - " + setuid + ", setgid - " + setgid + ", sticky bit - " + stickybit + leaveEmpty);

        line = scan.nextLine();
        appendNumber(setuid, 4000);
        appendNumber(setgid,2000);
        appendNumber(stickybit, 1000);
        appendWarnings();

        System.out.println("Palun sisesta soovitud kasutaja õigused (võib tühjaks jätta):");
        System.out.println("lugemine - " + read + ", kirjutamine - " + write + ", käivitamine - " + execute + leaveEmpty1);

        line = scan.nextLine();
        appendNumber(read, 400);
        appendNumber(write, 200);
        appendNumber(execute, 100);

        System.out.println("Palun sisesta soovitud grupi õigused (võib tühjaks jätta):");
        System.out.println("lugemine - " + read + ", kirjutamine - " + write + ", käivitamine - " + execute + leaveEmpty2);

        line = scan.nextLine();
        appendNumber(read, 40);
        appendNumber(write, 20);
        appendNumber(execute, 10);

        System.out.println("Palun sisesta soovitud teiste õigused (võib tühjaks jätta):");
        System.out.println("lugemine - " + read + ", kirjutamine - " + write + ", käivitamine - " + execute + leaveEmpty3);

        line = scan.nextLine();
        appendNumber(read, 4);
        appendNumber(write, 2);
        appendNumber(execute, 1);

        System.out.println("Valmis! Sisesta konsooli:\nchmod " + String.format("%04d", notation) + " failinimi");

    }
}

/* Näidisväljund


Tere tulemast chmod-generaatorisse!
Palun sisesta soovitud spetsiaalsed tähised:
setuid - u, setgid - g, sticky bit - t (võib tühjaks jätta)
>u
Palun sisesta soovitud kasutaja õigused (võib tühjaks jätta):
lugemine - r, kirjutamine - w, käivitamine - x (setuid töötamiseks tuleb execute määrata)
>rwx
Palun sisesta soovitud grupi õigused (võib tühjaks jätta):
lugemine - r, kirjutamine - w, käivitamine - x (võib tühjaks jätta)
>rw
Palun sisesta soovitud teiste õigused (võib tühjaks jätta):
lugemine - r, kirjutamine - w, käivitamine - x (võib tühjaks jätta)
>r
Valmis! Sisesta konsooli:
chmod 4764 failinimi

*/
