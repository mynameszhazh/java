package src.network.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
  private Socket s;

  public ServerThread(Socket s) {
    this.s = s;
  }

  @Override
  public void run() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
      // 解决名称冲突问题
      int count = 0;
      File file = new File("src/test/copy" + count + ".java");
      while (file.exists()) {
        count++;
        file = new File("src/test/copy" + count + ".java");
      }
      BufferedWriter bw = new BufferedWriter(new FileWriter(file));

      String line;
      while ((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
        bw.flush();
      }

      // 给出反馈
      BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
      bwServer.write("文件上传成功");
      bwServer.newLine();
      bwServer.flush();

      s.close();
      bw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
