package src.error;

import java.util.Scanner;

public class TeacherTest {
  public static void main(String[] args) {
    Teacher t = new Teacher();
    Scanner s = new Scanner(System.in);
    int score = s.nextInt();
    try {
      t.checkScore(score);
    } catch (ScoreException e) {
      e.printStackTrace();
    }
    s.close();
  }
}
