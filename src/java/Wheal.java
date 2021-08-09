package java;

import java.util.Objects;

public class Wheal {
  private int diameter;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wheal wheal = (Wheal) o;
    return diameter == wheal.diameter;
  }

  @Override
  public int hashCode() {
    return Objects.hash(diameter);
  }

  public Wheal() {
    System.out.println("At all don't need it");
  }

  @Override
  public String toString() {
    return "Wheal";
  }
}
