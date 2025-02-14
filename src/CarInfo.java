/*
 *  Title: Assignment 6 - Hashing
 *  Created by: Robert Norlander
 *  Email: shamotar@csp.edu
 *  Date: 2025-02-16
 *  Class: CSC 420 - Data Structures and Algorithms
 *  Professor: Susan Furtney
 */


 /**
  * Enum for car types
  */
enum CarType {
  SEDAN, SUV, TRUCK, COUPE, VAN
}

public class CarInfo {
  private String make;
  private CarType type;
  private String owner;
  private String licenseState;
  private String licensePlate;

  public CarInfo() {
    make = randomMake();
    type = randomCarType();
    owner = randomFirstName() + " " + randomLastName();
    licenseState = randomLicenseState();
    licensePlate = randomLicensePlate();
  }

  /**
   * @return A unique hash code for this object based on the license state,
   *         license plate and owner
   */
  @Override
  public int hashCode() {
    int key = licenseState.hashCode() * licensePlate.hashCode() * owner.hashCode();
    return Math.abs(key) % 100;
  }

  /**
   * @return A string representation of this object
   */
  @Override
  public String toString() {
    return String.format("Car is: %s - %s %s %s %s", owner, licensePlate, licenseState, make, type);
  }

  /**
   * @return A random first name
   */
  public String randomFirstName() {
    String[] names = { "John", "Jane", "Bob", "Sue", "Alice", "Charlie", "David", "Eve", "Frank", "Grace" };
    return names[(int) (Math.random() * names.length)];
  }

  /**
   * @return A random last name
   */
  public String randomLastName() {
    String[] names = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
        "Taylor" };
    return names[(int) (Math.random() * names.length)];
  }

  /**
   * @return A random car type
   */
  public CarType randomCarType() {
    CarType[] types = CarType.values();
    return types[(int) (Math.random() * types.length)];
  }

  /**
   * @return A random license state
   */
  public String randomLicenseState() {
    String[] states = { "MN", "WI", "IA", "ND", "SD", "NE", "IL", "MI", "OH", "IN" };
    return states[(int) (Math.random() * states.length)];
  }

  /**
   * @return A random license plate
   */
  public String randomLicensePlate() {
    String plate = "";
    for (int i = 0; i < 3; i++) {
      plate += (char) ('A' + (int) (Math.random() * 26));
    }
    for (int i = 0; i < 3; i++) {
      plate += (char) ('0' + (int) (Math.random() * 10));
    }
    return plate;
  }

  /**
   * @return A random make
   */
  public String randomMake() {
    String[] makes = { "Ford", "Chevy", "Toyota", "Honda", "Nissan", "Subaru", "Jeep", "Dodge", "Chrysler", "Buick" };
    return makes[(int) (Math.random() * makes.length)];
  }
}
