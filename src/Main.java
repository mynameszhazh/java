package src;

import src.test.Phone;

public class Main {
  public static void main(String[] args) {
    Phone phone = new Phone(1);

    phone.brand = "小米";

    phone.call();
  }
}
