package java;

import java.util.List;

public class Car {
  private List<Wheal> whealList;

  public Car(List<Wheal> whealList) {
    this.whealList = whealList;
    System.out.println("Constructor new");

  }

  public static void main(String[] args) {

  }
  public void ride(String name) {
    System.out.println("Riding " + name);
    System.out.println("Riding " + name);
    System.out.println("Riding " + name);
  }
}
