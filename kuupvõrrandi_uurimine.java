import java.lang.*;

// Kuupvõrrandi uurimise ja lahendamise idee:
// https://en.wikipedia.org/w/index.php?title=Cubic_function&oldid=882962489
/*
	Kõikvõimalike kuupvõrrandite lahendamine eeldab kompleksarvude
	kasutamist. Käesolevas programmis lahendan ainult selliseid erilisi
	kuupvõrrandeid, mida saab lahendada ilma kompleksarvude kasutamiseta.
*/	

public class Kuupvorrand
{
	 public static void main(String [] kordajad)
	 {
		double a = Double.parseDouble(kordajad[0]);
		double b = Double.parseDouble(kordajad[1]);
		double c = Double.parseDouble(kordajad[2]);
		double d = Double.parseDouble(kordajad[3]);

		double esimene_diskriminant = 18*a*b*c*d - 4*b*b*b*d 
		+ b*b*c*c - 4*a*c*c*c - 27*a*a*d*d ;

		double teine_diskriminant = b*b - 3*a*c ;

		String teade = "Antud kuupvorrandil on ";
		double lahend   ;
		double lahend_2 ;
/*	
		Täpsus, ehk lävi, mille piires reaalarve võrdlen.
		Arvu, mis on nullile lähemal kui muutujas LAVI antud
		läveväärtus, loen võrdseks nulliga.
*/		
		double LAVI = 0.0000000001 ;

		if(esimene_diskriminant > LAVI)
		{
			System.out.println(teade 
				+ "kolm erinevat reaalarvulist lahendit.");
		}
		else if (esimene_diskriminant < -LAVI) 
		{
			System.out.println(teade 
				+ "uks reaalarvuline lahend ja "
				+ "kaks kompleksarvulist lahendit.");
		}
		else
		{
			if ( teine_diskriminant < LAVI 
				 && teine_diskriminant > -LAVI )
			{
				System.out.println(teade 
					+ "kolm vordset reaalarvulist lahendit.");
				lahend = -b/(3*a) ;
				System.out.println(lahend);

				return;
			}
			else if ( teine_diskriminant > LAVI 
				 	  || teine_diskriminant < -LAVI )
			{
				System.out.println(teade 
					+ "reaalarvuline topeltlahend ja uks tavaline" 
					+ "reaalarvuline lahend.");				

				System.out.println("Topeltlahend on: ");

				lahend = ( 9*a*d - b*c ) / ( 2 * teine_diskriminant );
				System.out.println(lahend);

				System.out.println("Tavaline lahend on: ");

				lahend = ( 4*a*b*c - 9*a*a*d - b*b*b)
								/ ( a * teine_diskriminant );
				System.out.println(lahend);

				return;
			}
		}


		double kolmas_diskriminant = 2*b*b*b - 9*a*b*c + 27*a*a*d ;

		double neljas_diskriminant = -27*a*a * esimene_diskriminant ;
/*
 		Kui ruutjuure märgi alla jääb positiivne arv, 
		siis saab lahendeid edasi otsida. Vastasel korral
		tuleb arvutada kompleksarvudega, ja seda ma hetkel ei puuduta.
*/
		if(neljas_diskriminant >= 0)
		{
			double A = kolmas_diskriminant 
						+ Math.pow(neljas_diskriminant, 0.5);
			
			double B = kolmas_diskriminant 
						- Math.pow(neljas_diskriminant, 0.5);
			double C;
			
			if( A >= 0 )
			{
				C = Math.cbrt( A/2 );

				lahend = -1/(3*a) * ( b + C + teine_diskriminant/C );
				
				System.out.println("Reaalarvuline lahend on:");
				System.out.println(lahend);				
			}

			if( B >= 0 )
			{
				C = Math.cbrt( B/2 );

				lahend_2 = -1/(3*a) * ( b + C + teine_diskriminant/C );
				
				if (lahend_2 != lahend)
				{
					System.out.println("Reaalarvuline lahend on:");
					System.out.println(lahend_2);					
				}
			}
		}
	}
}

/*
Järgnevalt mõned kuupvõrrandite kordajad
ja reaalarvulised lahendid testimiseks:

Kolm võrdset lahendit:

8 -36 54 -27	-> 1.5

1 6 12 8		-> -2

2 -6 6 -2		-> 1


Topeltlahendiga kuupvõrrand:

1 1 -33 63		-> -7; 3; 3

Kolm erinevat reaalarvulist lahendit:

2 -4 -22 24		-> -3; 1; 4


Üks reaalarv ja kaks kompleksarvu:

1 2 3 4			-> -1.6506... ; ...

1 2 -3 4		-> -3.2842... ; ...

*/


// Lahendeid saab kontrollida nt siin:
// http://www.1728.org/cubic.htm
