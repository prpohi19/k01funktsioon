public class esimene{

  public static double kgToLbs(double kg){
    double lbs = kg * 2.20462262185;
    return lbs;
  }
  public static double lbsToKg(double lbs){
    double kg = lbs / 2.20462262185;
    return kg;
  }
  public static void main(String[] arg){
      System.out.println(kgToLbs(79));
      System.out.println(lbsToKg(175));
  }
}

/*
OUTPUT
174.16518712615
79.37866474995592
*/
