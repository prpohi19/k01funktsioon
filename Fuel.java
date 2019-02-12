/*Valisin oma teemaks mootorspordi.
Siin failis arvutatakse keskmine kütuse kulu ringi ja kilomeetri peale kasutades infot viimaselt viielt ringilt.
Lisaks arvutatakse mitu ringi on võimalik veel paagiga sõita ja kui palju kütust on vaja finišisse jõudmiseks*/


public class Fuel {

    //Kui palju kütust kulus viimasel viiel ringil liitrites
    static double r1 = 3.49;
    static double r2 = 3.45;
    static double r3 = 3.51;
    static double r4 = 3.50;
    static double r5 = 3.48;

    //Mitu ringi on sõidetud viimasest tankimise korrast
    static double lapsDone = 7;
    //Kui suur on kütusepaak
    static double fuelTank = 85;
    //Mitu ringi on veel sõita
    static double lapsLeft = 45;
    //Kui pikk on üks ring
    static double lapLenght = 7.004;

    //Arvutab välja palju kütust läks kokku 5 ringi peale
    public static double totalFuelUsed(double lap1, double lap2, double lap3, double lap4, double lap5){
        return lap1+lap2+lap3+lap4+lap5;
    }
    //Kui palju kütust on paagis
    public static double fuelLeft(double lapsDone){
        return fuelTank - lapsDone * avgFuelPerLap();
    }
    //Arvutab välja keskmisse kütuse kulu ringi peale
    public static double avgFuelPerLap(){
        return totalFuelUsed(r1,r2,r3,r4,r5)/5;
    }
    //Arvutab välja keskmise kütuse kulu kilomeetri peale
    public static double avgFuelPerKm(double lapLen){
        return totalFuelUsed(r1,r2,r3,r4,r5)/(lapLen*5);
    }
    //Arvutab välja mitu ringi on veel võimalik sõita
    public static double lapsLeft(double lapsDone){
        return fuelLeft(lapsDone)/avgFuelPerLap();
    }
    //Arvutab välja kui palju kütust on vaja lõpuni jõudmiseks
    public static double totalFuelNeeded(double laps){
        return laps*avgFuelPerLap() - fuelLeft(lapsDone);
    }
    //Arvutab välja kas on vaja käia veel kütust tankimas
    public static double pitstops(double fTank){
        double a = totalFuelNeeded(lapsLeft)/fTank;
        double rounded_a = Math.ceil(a);
        return rounded_a;
    }

    public static void main(String[] arg) {
        System.out.println("Täis paak: " +  fuelTank + " liitrit");
        System.out.println("Ringi pikkus: " + lapLenght + " km.");
        System.out.println();
        System.out.println("Keskmine kütusekulu ringi peale: " + String.format("%.3f",avgFuelPerLap()) + " liitrit");
        System.out.println("Keskmine kütusekulu km peale: " + String.format("%.3f", avgFuelPerKm(lapLenght)) + " liitrit");
        System.out.println("Kütust on veel alles: " + fuelLeft(lapsDone) + " liitrit");
        System.out.println("Kütust jagub veel " + String.format("%.3f", lapsLeft(lapsDone)) + " ringi / " + String.format("%.3f",lapsLeft(lapsDone)*lapLenght) + " km");
        if(totalFuelNeeded(lapsLeft) > 0){
        System.out.println("Finišisse jõudmiseks on vaja tankida " + String.format("%.3f", totalFuelNeeded(lapsLeft)) + " liitrit kütust");
        }else{
            System.out.println("Finišisse jõudmiseks pole vaja kütust juurde tankida");
        }
        if(pitstops(fuelTank) > 0){
        System.out.println("Finišisse jõudmiseks on vaja käia " + String.format("%.0f", pitstops(fuelTank)) + " korda tankimas");
        }else{
            System.out.println("Finišisse jõudmiseks pole vaja käia tankimas");
        }
    }
}
