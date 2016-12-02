package msc.ddb.fc;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reads the month and year from the Commandline.
 */
public class YearMonthInput {

  /**
   * Reads the year from the scanner and ensures the date is between 1995 and the year
   * of the passed in parameter datum.
   *
   * @param keyboard the scanner to read from.
   * @param datum    the year entered is compared (less then or equal <=) to the property Year of the datum.
   *
   * @return the validated year read from the scanner.
   */
  public int readYear(Scanner keyboard, LocalDate datum) {
    int yearInnerhalbderMethode = 0;

    while (true) {
      System.out.print("Geburtsjahr: ");

      try {

        yearInnerhalbderMethode = keyboard.nextInt();

        if (yearInnerhalbderMethode >= 1995 && yearInnerhalbderMethode <= datum.getYear()) {
          break;
        }

        System.out.println("Bitte geben Sie eine gültige Jahreszahl zwischen 1995 und 2016 ein");

      } catch (InputMismatchException ex) {
        System.err.println("Das ist keine ganze Zahl!");
        keyboard.nextLine();
      }

    }
    return yearInnerhalbderMethode;
  }

  /**
   * Reads the month from the scanner and ensures that the month is not in the future based on yearDasisteinParameter.
   *
   * @param keyboard               the scanner to read the year from.
   * @param datum                  the LocalDate which is specifies the year and month belongs to.
   * @param yearDasisteinParameter the current year.
   *
   * @return the validated month - the month may not be in the future.
   */
  public int readMonth(Scanner keyboard, LocalDate datum, int yearDasisteinParameter) {
    int monthInnerhalbderMethode = 0;

    while (true) {

      System.out.print("\nGeburtmonat in Zahlen:  ");

      try {

        monthInnerhalbderMethode = keyboard.nextInt();

        if (monthInnerhalbderMethode >= 1 && monthInnerhalbderMethode <= 12) {
          if (yearDasisteinParameter == datum.getYear()) {
            if (monthInnerhalbderMethode <= datum.getMonthValue()) {
              break;
            } else {
              System.out.println("Ihr Haustier ist noch ziemlich ungeboren... Bitte geben Sie ein korrektes DOB ein ;)");
              continue;
            }

          }
          break;
        }

        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 12 für das Geburtsmonat ihres Hundes ein");
      } catch (InputMismatchException ex) {
        System.err.println("Das ist keine ganze Zahl!");
        keyboard.nextLine();
      }
    }
    return monthInnerhalbderMethode;
  }

}
