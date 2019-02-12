public class Kodutoo {

    public static double leiaHobujoud(int kilowatt, double hobujoud) {
        return kilowatt/hobujoud;
    }

    public static double leiaKilowatt(double kilowatt, int hobujoud){
        return hobujoud*kilowatt;
    }

}


//Kuna ma tegin kaks eraldi faili, siis siia lisan veel main classi main.java
public class main {
    public static void main(String[] arg) {

        Kodutoo fuusika1=new Kodutoo();

        System.out.println(fuusika1.leiaHobujoud(527, 0.745699872));
        System.out.println(fuusika1.leiaKilowatt(0.745699872, 707));
    }

}
