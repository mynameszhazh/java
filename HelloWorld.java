import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    Random r = new Random();
    int number = r.nextInt(100) + 1;

    Scanner sr = new Scanner(System.in);

    while (true) {
      int num = sr.nextInt();
      if (num > number) {
        System.out.println("big le");
      } else if (num < number) {
        System.out.println("small");
      } else {
        System.out.println("right");
        break;
      }
    }
  }
}