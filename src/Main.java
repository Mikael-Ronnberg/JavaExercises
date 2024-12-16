import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mata in temperatur i celsius
        //Spara de 5 senaste temperaturerna
        //Räkna ut medelvärdet av de 5
        double[] savedTemps = new double[5];
        Scanner tempInput = new Scanner(System.in);
        for(int i = 0; i < savedTemps.length; i++) {
            while(true) {
                 try{
                    System.out.println("Input temperature " + (i + 1) + " in Celsius ");
                    String input = tempInput.nextLine();
                    double temp = Double.parseDouble(input);
                    savedTemps[i] = convertToFahrenheit(temp);
                    //System.out.println("Your temperature in Farenheit is " + savedTemps[i]) ;
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
        double median = 0;
        double[] celsiusTemps = new double[5];
        for(int i = 0; i < savedTemps.length; i++) {
            median += savedTemps[i];
            celsiusTemps[i] = convertToCelsius(savedTemps[i]);
            System.out.println("Temperature in index " +(i+1)+ " is " + savedTemps[i] + " Fahrenheit");
            //System.out.println(Arrays.toString(savedTemps));
        }

        System.out.println("Avarage temperature is " + median/savedTemps.length + " Fahrenheit, and is " + convertToCelsius(median/savedTemps.length) + " in Celsius");

        for(int i = 0; i < celsiusTemps.length; i++) {
            System.out.println("Temperature in index " +(i+1)+ " is " + celsiusTemps[i] + " Celsius");
            //System.out.println(Arrays.toString(savedTemps));
        }
    }

    static double convertToFahrenheit(double temp1) {
        return (temp1 * 1.8) + 32;
    }
    static double convertToCelsius (double temp2) {
        return (temp2 - 32) / 1.8;
    }
}
