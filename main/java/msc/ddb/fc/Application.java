package msc.ddb.fc;

import java.util.Scanner;

/**
 * Main Class of the FeedCalculator.
 */
public class Application {

  /**
   * Generates feeding plan.
   *
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("DER FUTTER-KALKULATOR");

    Scanner keyboard = new Scanner(System.in);

    String name;
    int weight, month, year;
    char antwort;

    System.out.print("Name des Hundes: ");
    name = keyboard.nextLine();

    System.out.print("\nGeburtmonat in Zahlen:  ");
    month = keyboard.nextInt();

    System.out.print("\nGeburtjahr:  ");
    month = keyboard.nextInt();

    System.out.print("\nGewicht in Gramm: ");
    weight = keyboard.nextInt();

    System.out.print("\nRasse (K für klein/G für groß):  ");
    antwort = keyboard.findWithinHorizon(".", 0).charAt(0);


    if (antwort != 'K' && antwort != 'k' && antwort != 'G' && antwort != 'g')

    {
      System.out.println("Bitte geben Sie K für kleine Rasse oder G für große Rasse ein");
    }
    // keyboard.close();
  }
}
