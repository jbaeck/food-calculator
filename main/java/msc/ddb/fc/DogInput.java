package msc.ddb.fc;

import java.util.Scanner;

/**
 * DogInput is used to create a Dog Instance from input read from the commandline.
 */
public class DogInput {

  /**
   * Provides an Commandline-Interface to create Dogs based on user input.
   *
   * @return a Dog instance based on the input provided by the user.
   */
  public Dog readInput() {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int weight, month, year = 0;
    char antwort;
    String breed = null;

    // Currently no errors are during the input are handled.
    // We expect the user to always enter correct data.
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
    keyboard.close();

    if (antwort == 'K' || antwort == 'k') {
      breed = "klein";
    }

    if (antwort == 'G' || antwort == 'g')

    {
      breed = "gross";
    }
    Dog dog = new Dog(name, weight, month, year, breed);

    return dog;

  }
}
