package tund1;

import java.util.Scanner;

public class kodune1 {

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter how many shots did you make: ");
        double shotsMade = reader.nextInt();
        System.out.println("Enter how many shots did get in: ");
        double shotsIn = reader.nextInt();
        reader.close();

        double score = ((shotsIn)/(shotsMade))*100;

        System.out.println("You made " + shotsMade + " shots.");
        System.out.println("You got " + shotsIn + " shots in.");
        System.out.println("Your shooting percantage is: " + score + "%");
        System.out.println(grade(score));
    }

    public static String grade(double score){
        if(score<30){
            return "You need to practice your shooting.";
        }else if(score<50){
            return "You are about average";
        }else if(score<75){
            return "You are doing good";
        }else if(score<95){
            return "You can shoot really well";
        }else{
            return "SNIPER";
        }
    }
}
