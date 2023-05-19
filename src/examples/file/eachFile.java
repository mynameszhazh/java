package src.examples.file;

import java.io.File;

public class eachFile {
  public static void main(String[] args) {
    File file = new File("src/examples");
    exportAllFileName(file);
  }

  static void exportAllFileName(File file) {
    File[] fileArr = file.listFiles();
    if (fileArr != null) {
      for (File f : fileArr) {
        if (f.isDirectory()) {
          exportAllFileName(f);
        } else {
          System.out.println(file.getAbsolutePath() + file.getName());
        }
      }
    }
  }
}
