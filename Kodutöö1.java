//Siia tuleb esimese kodutöö lahendus
//Hobujõu ja kilowattide mõõtmine

public class Ulesanne{
    
    public static double horsePower(){
      	
        double torque = 225;
        double rpm = 3000;
        
	return Math.round((torque*rpm/5252)*100.0)/100.0;
	}
	
	public static void main(String[] arg){
		
	  double convert = 735.49875;	
	  double watt = (Math.round((horsePower() * convert)*100.0)/100.0) / 1000;
      System.out.println("Hobujoud on " + horsePower() + " ehk " + watt + " kW.");
    }
}
