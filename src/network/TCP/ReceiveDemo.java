package src.network.TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveDemo {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(10000);
    while (true) {
      Socket s = ss.accept();
      // 创建一个新的线程
      new Thread(new ServerThread(s)).start();
    }
  }
}
