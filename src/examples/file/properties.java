package src.examples.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class properties {
  public static void main(String[] args) throws IOException {
    mystore();

    myload();
  }

  private static void myload() throws IOException {

    Properties prop = new Properties();
    FileReader fr = new FileReader("src/examples/test/index.js");
    prop.load(fr);

    fr.close();
    System.out.println(prop);
  }

  private static void mystore() throws IOException {
    Properties prop = new Properties();

    prop.setProperty("it", "xjh");
    prop.setProperty("it2", "xjh3");
    prop.setProperty("it3", "xjh4");

    FileWriter fw = new FileWriter("src/examples/test/index.js");

    prop.store(fw, null);
    fw.close();
  }
}
