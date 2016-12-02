package msc.ddb.fc;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a Dog to calculate the food for.
 */
public class Dog {

  private String m_name;
  private int m_weight;       // Variablen
  // Added month and year.
  private int m_month;
  private int m_year;
  private String m_breed;
  private int m_age;

  public Dog(String name, int weight, int month, int year, String breed){       // Konstruktor (int weight = Parameter)
    m_name = name;
    m_weight = weight;
    m_month = month;
    m_year = year;
    m_breed = breed;

    // calculate the age of the Dog in months based on the parameters
    // month + year and now (today).
    LocalDate dob = LocalDate.of(m_year, m_month, 1);
    LocalDate now = LocalDate.now();

    long alterInMonaten = ChronoUnit.MONTHS.between(dob, now);

    m_age = Long.valueOf(alterInMonaten).intValue();
  }

  public String getName(){
    return m_name;
  }

  public int getWeight(){     // Methoden
    return m_weight;
  }

  public int getMonth(){
    return m_month;
  }

  public int getYear(){
    return m_year;
  }

  public String getBreed(){
    return m_breed;
  }

  public int getAge() {
    return m_age;
  }
}
