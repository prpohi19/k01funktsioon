public class KoeraVanus{

  public static double leiaTulemus(double koeraVanus){
    return koeraVanus*6;
}
 public static String koeraInimVanus(double koeraVanus){
     if(koeraVanus<3){
       return "Koer on inim-lapseeas";
    } else if(koeraVanus<6){
       return "Koer inim-noores eas";
	} else if(koeraVanus<7){
       return "Koer kuldses inim-keskeas";
    } else if(koeraVanus<9){
       return "Koer läheneb inim-pensionieale";
    } else if(koeraVanus<12){
       return "Koer on inim-pensionieas";
    } else {
       return "Koer on juba väga vana";
}
}
  public static void main(String[] arg){
    double koeraVanus=11;

    System.out.println(koeraVanus+" aastat vana koer "+leiaTulemus(koeraVanus)+" inimaastat vana");
    System.out.println(koeraInimVanus(koeraVanus));
}
}
