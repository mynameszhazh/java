package src.test;

import java.util.Arrays;

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
}