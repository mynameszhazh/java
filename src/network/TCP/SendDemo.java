package src.network.TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class SendDemo {

  public static void main(String[] args) throws IOException {
    testSocket();
  }

  private static void testSocket() throws IOException {
    Socket s = new Socket("192.168.0.100", 10000);

    BufferedReader br = new BufferedReader(new FileReader("src/test/Phone.java"));

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

    String line;
    while ((line = br.readLine()) != null) {
      bw.write(line);
      bw.newLine();
      bw.flush();
    }

    s.shutdownOutput();

    BufferedReader brClinet = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String data = brClinet.readLine();
    System.out.println("服务器反馈:" + data);

    br.close();
    s.close();
  }

}