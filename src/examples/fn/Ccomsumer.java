package src.examples.fn;

import java.util.function.Consumer;

public class Ccomsumer {
  public static void main(String[] args) {
    String[] strArr = { "nihao,12", "xjh,33", "hh,23" };
    useComsumer(strArr, str -> {
      String name = str.split(",")[0];
      System.out.print(name);
    }, str -> {
      String age = str.split(",")[1];
      System.out.println(age);
    });
  }

  private static void useComsumer(String[] strArr, Consumer<String> cum, Consumer<String> cum2) {
    for (String str : strArr) {
      cum.andThen(cum2).accept(str);
    }
  }

}
