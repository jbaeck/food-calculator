package msc.ddb.fc;

/**
 * Represents a Dog to calculate the food for.
 */
public class Dog {
  //Klassenvariablen
  private int m_weight;
  private int m_age;
  private String m_breed;

  //Konstruktoren

  /**
   * Creates a dog with the specified weight,breed and age.
   * <p>
   * The breed is only allowed to be "Klein" or "Gross" and the age is in months since birth.
   *
   * @param weight the current weight of the Dog
   * @param breed  either "Klein" or "Gross".
   * @param age    the age in months.
   */
  public Dog(int weight, String breed, int age) {
    m_weight = weight;
    m_breed = breed;
    m_age = age;
  }

  //Methoden
  public int getWeight() {
    return m_weight;
  }

  public int getAge() {
    return m_age;
  }

  public String getBreed() {
    return m_breed;
  }

}
