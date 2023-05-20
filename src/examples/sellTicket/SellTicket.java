package src.examples.sellTicket;

public class SellTicket implements Runnable {
  private static int tickets = 100;

  @Override
  public void run() {
    // 进行买票的操作
    while (true) {
      if (tickets > 0) {
        // synchronized (this) {
        // try {
        // Thread.sleep(10);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets +
        // "张票");
        // tickets--;
        // }
        handleSellTicket();
      } else {
        break;
      }
    }
  }

  static synchronized void handleSellTicket() {
    try {
      Thread.sleep(10);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
    tickets--;
  }
}
