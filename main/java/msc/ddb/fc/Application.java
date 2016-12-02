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

    // Moved the logic to read from the commandline into a own class.
    // We now have a single location to handle input from the commandline
    // and the Application class can simply use the functionality provided by the
    // DogInput.
    DogInput dogInput = new DogInput();
    Dog dog = dogInput.readInput();

    System.out.println("Created Dog with name :" + dog.getName());
  }
}
