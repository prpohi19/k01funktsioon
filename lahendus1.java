java kood ja tuleb esimese kodutöö lahendus
kodutööks on teisendus kilogrammist grammideks ja vastupidi
Main.java
public class Main {

    public static void main(String[] args) {
        fyysika arvutamine = new fyysika();

        System.out.println("Sisestatud kilogramm on  " + arvutamine.leiaG(123) + " grammi");
        System.out.println("Sisestaud gramm on " + arvutamine.leiaKg(12352360) + " kilogrammi");
    }
}

//
fyysika.java
public class fyysika {
    int pikkus=1000;

    public double leiaG(double kilogramm) {

        return kilogramm * pikkus;
    }

    public double leiaKg(double gramm) {
        return gramm / pikkus;
    }
}

//Kaks eraldi java classi, Main.java ja fyysika.java
