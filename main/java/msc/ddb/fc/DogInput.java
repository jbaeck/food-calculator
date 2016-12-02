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
  public Dog readInput(){
    Scanner keyboard = new Scanner(System.in);
    String name = null;                                  //variable
    int weight, month, year;
    char antwort;
    String breed = null;

    // while loop - runs as long as the condition in () is ture - in our case the loop runs
    //              forever and only breaks when we use the "break" keyword.
    //              The "continue" is used to return to the Start of the loop when wrong data
    //              was added.
    while (true) {
      System.out.print("Name des Hundes: ");
      name = keyboard.nextLine();

      if(name.isEmpty()){
        System.out.println("Bitte geben sie den Namen ihres Hundes ein");
        continue;
      }
      break;
    }

    while (true) {
      System.out.print("\nGeburtmonat in Zahlen:  ");
      month = keyboard.nextInt();

      if(month >= 1 && month <= 12){
        break;
      }

      System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 12 für das Geburtsmonat ihres Hundes ein");
    }

    while (true) {
      System.out.print("\nGeburtjahr:  ");
      year = keyboard.nextInt();

      if(year >= 1995 && year <= 2016){
        break;
      }

      System.out.println("Bitte geben Sie eine Jahreszahl zwischen 1995 und 2016 ein");
    }

    while (true) {
      System.out.print("\nGewicht in Gramm: ");
      weight = keyboard.nextInt();

      if(weight >= 0 && weight <= 1000000){
        break;
      }

      System.out.println("Bitte geben Sie das Gewicht ihres Hundes in Gramm ein");
    }

    while (true) {
      System.out.print("\nRasse (K für klein/G für groß):  ");
      antwort = keyboard.findWithinHorizon(".", 0).charAt(0);


      if (antwort != 'K' && antwort != 'k' && antwort != 'G' && antwort != 'g')

      {
        System.out.println();
        System.out.println("Bitte geben Sie K für kleine Rasse oder G für grosse Rasse ein");
        continue;
      }

      keyboard.close();


      if (antwort == 'K' || antwort == 'k') {
        breed = "klein";
      }

      if (antwort == 'G' || antwort == 'g')

      {
        breed = "gross";
      }
      break;
    }

    Dog dog = new Dog(name, weight, month, year, breed);

    return dog;
  }}
