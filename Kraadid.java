// Esimene kodutöö
//Funktsioon temperatuuride convertimiseks

public class Kraadid {
	public static void main(String[] args) {
    	System.out.println("0*C on Fahrenheitis: "+CelToFar(0)+"*F");
    	System.out.println(" ");
    	System.out.println("32*F on Celsisuses: "+FarToCel(32)+"*C");

    	}
    	public static double CelToFar(double cel) {
				return (cel * 9/5) + 32;
			}
    	public static double FarToCel(double far) {
				return (far - 32) * 5/9;
			}

    }
