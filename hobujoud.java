public class hobujoud{
	
	public static int leiahobujoud(int rpm, int ft, int rdps){
		return (rpm * ft) / rdps ;
	}
	public static void main(String[] arg){
		System.out.println(leiahobujoud(3000,440,5252));
	}
}
// motooril on 251 hobujõudu