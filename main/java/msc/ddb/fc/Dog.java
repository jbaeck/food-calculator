package msc.ddb.fc;

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

  public Dog(String name, int weight, int month, int year, String breed){       // Konstruktor (int weight = Parameter)
    m_name = name;
    m_weight = weight;
    m_month = month;
    m_year = year;
    m_breed = breed;
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
}
