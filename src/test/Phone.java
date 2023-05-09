package src.test;

import java.util.ArrayList;

public class Phone {
  public String brand;
  public int price;

  /**
   * 
   */
  public void call() {
    ArrayList<String> arr = new ArrayList<String>();

    System.out.println("call me");

  }

  public Phone() {
    System.out.println("phone init not");
  }

  public Phone(int a) {
    // System.out.printf("phone init aaaaa");
  }

}
