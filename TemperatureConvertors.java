import java.util.scanner;

public class TemperatureConverter{

    public static void main(string[] args){
        // Writing a program to convert measures of temperature
    scanner scan= new Scanner(System.in);
    System.out.println("Fahrenheit to celsius (1) or Celsius to Fahenrheit (2)");
    int result = scan.nextint();
    
    if (result == 1) {
        //calculate fahrenheit to celsius

        system.out.println("You have chosen FAHRENHEIT to CELSIUS!");
        system.out.println("Enter Fahrenheit Value: ");
        double value = scan.nextDouble();
        double ValueFinal = (value - 32) * 5/9;
        system.out.print("Celsius is: ");
        system.out.println(Math.round(valueFinal*10.0)/10.0);


    } else if (result == 2)
        //calculate celsius to fahrenheit

        system.out.println("You have chosen CELSIUS to FAHRENHEIT");
        system.out.println("Enter Celsius Value: ");
        double value2 = scan.nextDouble();
        double finalResult = value2 * 1.8 + 32;
        system.out.print("Fahrenreit is: ");
        system.out.println(Math.round(finalRsult*10.0)/10.0)

    } else {

        // Any number that is not 1 or 2
        system.out.println("Not a valid choice!");
    }
    


  }

}
