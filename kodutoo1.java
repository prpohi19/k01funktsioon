//1. kodutöö lahendus

import java.util.Scanner;

public class kodutoo1{
	public static void main(String[] arg){
  double kokku=0;
  double count=1;
	System.out.println("Keskmise hinde arvutaja");

  Scanner scan = new Scanner(System.in);
  System.out.println("Mitu hinnet soovid sisestada? ");
  int mitu = scan.nextInt();
  while (count<=mitu){
   System.out.println("Sisesta "+(int)count+". hinne: ");
   kokku+=scan.nextInt();
   count+=1;
  }
  double keskm=(kokku/mitu);
  System.out.println("Keskmine on " + keskm);
	}
}
