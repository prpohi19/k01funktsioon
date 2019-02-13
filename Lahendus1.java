//Esimene kodutöö//

import java.util.Scanner;
public class Algarv
{
    public static void main(String args[])
    {       
        int j, x, flag = 0;
        System.out.print("Sisesta number:");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for( j = 2; j < x; j++)
        {
            if(x % j == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
         }
         if(flag == 1)
         {
             System.out.println(""+x+" on algarv");
         }
         else
         {
             System.out.println(""+x+" ei ole argarv");
         }           
    }
}
