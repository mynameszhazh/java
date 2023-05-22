package src.test;

import java.util.Arrays;
import java.util.Calendar;

public class StringSorts {
  public void callSort() {
    String s = "98 65 23 45";
    String[] strArr = s.split(" ");

    int[] intArr = new int[strArr.length];
    for (int i = 0; i < intArr.length; i++) {
      intArr[i] = Integer.parseInt(strArr[i]);
    }

    Arrays.sort(intArr);

    StringBuilder ret = new StringBuilder();
    for (int i = 0; i < intArr.length; i++) {
      if (i == intArr.length - 1) {
        ret.append(intArr[i]);
      } else {
        ret.append(intArr[i]).append(' ');
      }
    }
    System.out.println(ret);
  }

  public void inter() {
    Integer i = Integer.valueOf(100);
    // System.out.println(i.hashCode());
    // int a = 123;
    // a += 30;
    // i += 30;
    System.out.println(i);
  }

  public void calendar() {
    Calendar c = Calendar.getInstance();
    System.out.println(c.getTime());
  }
}
