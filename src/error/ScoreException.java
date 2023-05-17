package src.error;

public class ScoreException extends Exception {
  public ScoreException() {

  }

  public ScoreException(String message) {
    // 注意这里相当于 js 中的construtor 操作
    super(message);
  }
}
