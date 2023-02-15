import java.util.Scanner;

public class Second{
   public static void main(String[] args) {
 
      System.out.println("----JX00-XC-HB1----\n");
      Scanner scannerObj = new Scanner(System.in);
      System.out.println("What is the total number of employees?");
      int emp = scannerObj.nextInt();
      System.out.println("What is the name of the Supervisor?");
      String name = scannerObj.next();
      System.out.println("How many times the Nuclear waste is removed from the core?");
      int waste = scannerObj.nextInt();
      System.out.println("What is the total weight of the waste produced every 1 week?");
      float wasteWeight = scannerObj.nextFloat();
      System.out.println("Is electric motor being replaced every 18 days? (y/n): ");
      char motorReplacement = scannerObj.next().charAt(0);
      System.out.print("Enter the core average temperature (in Celsius): ");
      float tempCelsius = scannerObj.nextFloat();
      float tempKelvin = tempCelsius + 273.15f;

        System.out.println("\n\nNuclear Reactor Status Update:");
        System.out.println("Total number of employees: " + emp);
        System.out.println("Supervisor name: " + name);
        System.out.println("Number of times nuclear waste is removed from the core: " + waste);
        System.out.println("Total weight of waste produced every 1 week: " + wasteWeight + " kg");
        System.out.println("Electric motor being replaced every 18 days: " + motorReplacement);
        System.out.println("Core average temperature: " + tempCelsius + " Celsius (" + tempKelvin + " Kelvin)");

      
   }
}