import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\n");

        String originScale = "X";
        while (!originScale.equals("F") || !originScale.equals("C") || !originScale.equals("K")){
          System.out.print("Enter an origin scale: ");
          originScale = in.nextLine().toUpperCase();;
        }

        String destScale = "X";
        while (!destScale.equals("F")||!destScale.equals("C")||!destScale.equals("K")){
          System.out.print("Enter a destination scale: ");
          originScale = in.nextLine().toUpperCase();;
        }

        System.out.print("Enter a temperature: ");
        double temperature = in.nextDouble();

        double finalTemp;
        if (originScale.equals("C")&&destScale.equals("F")){
          finalTemp = (temperature * (9/5)) + 32;
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°C equals", finalTemp, "°F.");
        } else if (originScale.equals("C")&&destScale.equals("K")){
          finalTemp = temperature + 273.15;
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°C equals", finalTemp, "°K.");
        } else if (originScale.equals("F")&&destScale.equals("C")){
          finalTemp = (temperature - 32) * (5/9);
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°F equals", finalTemp, "°C.");
        } else if (originScale.equals("F")&&destScale.equals("K")){
          finalTemp = ((temperature - 32) * (5/9)) + 273.15;
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°F equals", finalTemp, "°K.");
        } else if (originScale.equals("K")&&destScale.equals("C")){
          finalTemp = temperature - 273.15;
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°K equals", finalTemp, "°C.");
        } else if (originScale.equals("K")&&destScale.equals("F")){
          finalTemp = ((temperature - 273.15) * (9/5)) + 32;
          System.out.printf("\n%,.1f%s %,.1f%s\n", temperature, "°K equals", finalTemp, "°F.");
        }

        in.close();
    }
}
