public class k01funktsioon2{
/* Antud programm on mõeldud enda suurusele sobiva teksapaari leidmiseks*/
/* Teksapükste tüüpiline suurus toll teisendatakse sentimeetriteks, mis on */
/* vööümbermõõt ja sisesääre pikkus pükstel, seejärel antakse vastav suuruseühik S,M,L jne.*/
  public static double leiaTeisendus(double suurusTollides){
    return suurusTollides*2.54;
}
 public static String leiaSuurus(double suurusTollides){
     if(suurusTollides<26){
       return "XS või väiksemale";
    } else if(suurusTollides<29){
       return "S";
    } else if(suurusTollides<32){
       return "M";
    } else if(suurusTollides<35){
       return "L";
    } else{
       return "XL või suuremale";
}
}
  public static void main(String[] arg){
    double suurusTollides=24;
    if(arg.length==1){
      try{
        suurusTollides=Integer.parseInt(arg[0]);
      } catch(Exception ex) {
          System.out.println(arg[0] + " pole arv");
}
}
    System.out.println(suurusTollides+" tolli on "+leiaTeisendus(suurusTollides)+" sentimeetrit");
    System.out.println("Võrdlemisi on see vastav suurusele "+leiaSuurus(suurusTollides));
}
}

/* TULEMUS:

32.0 tolli on 81.28 sentimeetrit
Võrdlemisi on see vastav suurusele L */
