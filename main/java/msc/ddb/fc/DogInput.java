package msc.ddb.fc;

import java.time.LocalDate;
import java.util.InputMismatchException;
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
    LocalDate now = LocalDate.now();
    String name = null;                                  //variable
    int weight, month, year = 0;
    char antwort;
    String breed = null;
    // we created a class to deal with the month-year input.
    YearMonthInput yearMonth = new YearMonthInput();

    // refactored the code as it was very hard to read
    // deal with {}
    // also it was also very hard to find out what the spaghetti code did :)

    name = readName(keyboard);
    year = yearMonth.readYear(keyboard, now);
    month = yearMonth.readMonth(keyboard, now, year);
    weight = readWeight(keyboard);

    Dog dog = new Dog(name, weight, month, year, breed);

    return dog;
  }

  private String readName(Scanner keyboard) {
    String nameInnerhalbderMethode = null;

    while (true) {
      System.out.print("Name des Hundes: ");
      nameInnerhalbderMethode = keyboard.nextLine();

      if (nameInnerhalbderMethode.isEmpty()) {
        System.out.println("Bitte geben sie den Namen ihres Hundes ein");
        continue;
      }
      break;
    }

    return nameInnerhalbderMethode;
  }


  private int readWeight(Scanner keyboard) {
    int weigthInnerhalbderMethode = 0;

    while (true) {

      System.out.print("\nGewicht in Gramm: ");

      try{

        weigthInnerhalbderMethode = keyboard.nextInt();

        if (weigthInnerhalbderMethode >= 0 && weigthInnerhalbderMethode <= 1000000) {
          break;
        }

        System.out.println("Bitte geben Sie das Gewicht ihres Hundes in Gramm ein");
      }

      catch(InputMismatchException ex) {
        System.err.println("Das ist keine ganze Zahl!");
        keyboard.nextLine();
      }
    }
    return weigthInnerhalbderMethode;
  }

  private String readBreed(Scanner keyboard) {
    char antwortInnerhalbderMethode;
    String breedInnerhalbderMethode = null;

    while (true) {
      System.out.print("\nRasse (K für klein/G für groß):  ");
      antwortInnerhalbderMethode = keyboard.findWithinHorizon(".", 0).charAt(0);


      if (antwortInnerhalbderMethode != 'K' && antwortInnerhalbderMethode != 'k' && antwortInnerhalbderMethode != 'G' && antwortInnerhalbderMethode != 'g')

      {
        System.out.println();
        System.out.println("Bitte geben Sie K für kleine Rasse oder G für grosse Rasse ein");
        continue;
      }

      keyboard.close();


      if (antwortInnerhalbderMethode == 'K' || antwortInnerhalbderMethode == 'k') {
        breedInnerhalbderMethode = "klein";
      }

      if (antwortInnerhalbderMethode == 'G' || antwortInnerhalbderMethode == 'g')

      {
        breedInnerhalbderMethode = "gross";
      }
      break;
    }

    return breedInnerhalbderMethode;
  }
}
