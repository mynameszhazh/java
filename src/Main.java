package src;

import src.test.Phone;

public class Main {
  public static void main(String[] args) {
    Phone phone = new Phone(1);
    Phone phone22 = new Phone();

    phone.brand = "小米";

    System.out.println(phone.brand);
    System.out.println(phone22);
    System.out.println(phone.price);

    phone.call();
  }
}
