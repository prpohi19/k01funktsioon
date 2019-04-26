import java.util.Scanner;
public class Kodutoo1 
{

    public static void main(String[] args) 
    {
		Scanner scanner = new Scanner(System.in);

		float aegSekundites;
		float kph, mph;

		System.out.print("Sisesta distants kilomeetrites ");
		float distants = scanner.nextFloat();

		System.out.print("Sisesta treening tunnid: ");
		float hr = scanner.nextFloat();

		System.out.print("Sisesta minutid: ");
		float min = scanner.nextFloat();

		System.out.print("Sisesta sekundid: ");
		float sec = scanner.nextFloat();

		aegSekundites = (hr*3600) + (min*60) + sec;
		kph = ( distants) / ( aegSekundites/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Sinu trenni keskmine kiirus on"+kph+"km/h");
		System.out.println("Sinu trenni keskmine kiirus on"+mph+"mph");


		scanner.close();
	}
}