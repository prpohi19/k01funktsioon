import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
    See kodutöö arvutab välja kahe värvi vahel olevad värvid, et neid saaks sujuvalt vahetada.
    Mõeldud kasutamiseks RGB LED'ide animeerimise jaoks.
*/
public class GradientCalculator {

    private Scanner scanner;

    public GradientCalculator() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        GradientCalculator calc = new GradientCalculator();

        System.out.println("Sisesta esimene v2rv (#ffffff):");
        Color startColor = calc.askColor();
        
        System.out.println("Sisesta teine v2rv (#ffffff):");
        Color endColor = calc.askColor();
        System.out.println();
        
        // Create all steps between two colors
        List<Color> colors = calc.createGradient(startColor, endColor, 254, true);

        // Print all colors in hex
        calc.printGradient(colors);
    }

    /*
        This is the important function.

        Interpolates between two colors.
    */
    public List<Color> createGradient(Color startColor, Color endColor, int steps, boolean bLoop) {
        // Store all colors
        List<Color> colors = new ArrayList<>();
        
        if (bLoop) {
            steps = Math.round(steps / 2);
        }

        for (int i = 0; i < steps; i++) {
            float interpolation = (float) i / (steps-1);
            float reverseInterp = 1 - interpolation;

            // Each channel has to be done separately
            int red = Math.round(endColor.getRed() * interpolation + startColor.getRed() * reverseInterp);
            int green = Math.round(endColor.getGreen() * interpolation + startColor.getGreen() * reverseInterp);
            int blue = Math.round(endColor.getBlue() * interpolation + startColor.getBlue() * reverseInterp);
            int alpha = Math.round(endColor.getAlpha() * interpolation + startColor.getAlpha() * reverseInterp);

            //System.out.println("Color:" + red + " " + green + " " + blue + " " + alpha);
            Color color = new Color(red, green, blue, alpha);
            colors.add(color);
        }

        if (bLoop) {
            // Create a shallow copy of all the colors
            List<Color> newColors = new ArrayList<>(colors);
            // Reverse the order
            Collections.reverse(newColors);
            // Add them to the final list
            colors.addAll(newColors);
        }

        return colors;
    }




    public Color askColor() {
        Color color;
        
        while (true) {
            String s = scanner.next();
            try {
                color = Color.decode(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Vigane v2rv!");
            }
        }
        return color;
    }

    /*
        Prints all colors in hex
    */
    public void printGradient(List<Color> colors) {
        for (Color color : colors) {
            System.out.println(String.format("#%02x%02x%02x%02x", color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
        }
    }
}