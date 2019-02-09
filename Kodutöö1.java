//Kehamassiindeksi kalkulaator.
//Priit Laupa, kodune töö 1.

import java.util.Scanner;

public class Kodune1{
	public static String hinnang(double kmindeks){
		String vastus = "";
		if (kmindeks > 40.1){
			vastus = "Tervisele ohtlik rasvumine";
		} else if (kmindeks <= 40 && kmindeks > 35) {
			vastus = "Tugev rasvumine";
		} else if (kmindeks <= 35 && kmindeks > 30) {
			vastus = "Rasvumine";
		} else if (kmindeks <= 30 && kmindeks > 25) {
			vastus = "Ülekaal";
		} else if (kmindeks <= 25 && kmindeks > 18.6) {
			vastus = "Normaalkaal";
		} else if (kmindeks <= 18.5 && kmindeks > 16) {
			vastus = "Alakaal";
		} else {
			vastus = "Tervisele ohtlik alakaal";
		}
		return vastus;
	}
	public static void main(String[] args){
		String line = "-------------------------------------";
		System.out.println(line);
		System.out.println("Kehamassiindeksi kalkulaator");
		System.out.println(line);
		Scanner input = new Scanner(System.in);
		System.out.print("Sisestage oma kehakaal: ");
		double kaal = input.nextDouble();
		System.out.print("Sisestage oma pikkus sentimeetrites: ");
		double pikkus = input.nextDouble();
		double kmindeks = 0;
		kmindeks = 1.3 * kaal / Math.pow((pikkus/100), 2.5);
		System.out.println(line);
		System.out.printf("Kehamassiindeksi valemi järgi on: %.2f %n", kmindeks);
		System.out.println(line);
		System.out.println("Hinnang kehamassiindeksile: " + hinnang(kmindeks));
		System.out.println(line);
	}
}
