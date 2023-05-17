package src.error;

public class Teacher {

  public void checkScore(int score) throws ScoreException {
    if (score < 0 || score > 100) {
      throw new ScoreException("你给的分数有误, 分数需要 0-100之间");
    } else {
      System.out.println("分数正常");
    }
  }
}
