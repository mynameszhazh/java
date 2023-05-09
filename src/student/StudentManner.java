package src.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManner {

  public static ArrayList<Student> studentArr;

  public static void main(String[] args) {
    studentArr = new ArrayList<Student>();
    Scanner sr = new Scanner(System.in);
    while (true) {
      System.out.println("输入编号 进行操作");
      System.out.println("1: add");
      System.out.println("2: del");
      System.out.println("3: edit");
      System.out.println("4: view");
      System.out.println("5: exit");

      String type = sr.nextLine();
      switch (type) {
        case "1":
          System.out.println("姓名");
          String name = sr.nextLine();
          System.out.println("姓名");
          String age = sr.nextLine();
          System.out.println("地址");
          String address = sr.nextLine();
          addStudent(name, age, address);
          break;
        case "2":
          System.out.println("删除的学生名字");
          delStu(sr.nextLine());
          break;
        case "3":
          System.out.println("编辑的学生名字");
          editStu(sr.nextLine(), sr);
          break;
        case "4":
          viewStu();
          break;
        case "5":
          sr.close();
          break;
        default:
          break;
      }
      if (type.equals("5")) {
        System.err.println("退出成功");
        break;
      }

    }
  }

  private static void viewStu() {
    for (int i = 0; i < studentArr.size(); i++) {
      Student temp = studentArr.get(i);
      System.out.printf(temp.getName());
      System.out.printf("|");
      System.out.printf(temp.getAge());
      System.out.printf("|");
      System.out.printf(temp.getAddress());
      System.out.println("");
      System.out.println("-------------------");
    }
  }

  private static void editStu(String name, Scanner sr) {
    for (int i = 0; i < studentArr.size(); i++) {
      Student temp = studentArr.get(i);
      if (temp.getName().equals(name)) {
        System.out.println("新姓名");
        temp.setName(sr.nextLine());
        System.out.println("新年龄");
        temp.setAge(sr.nextLine());
        System.out.println("新地址");
        temp.setAddress(sr.nextLine());
      }
    }
    System.out.println("编辑成功");
  }

  private static void delStu(String name) {
    for (int i = 0; i < studentArr.size(); i++) {
      Student temp = studentArr.get(i);
      if (temp.getName().equals(name)) {
        studentArr.remove(i);
      }
    }
    System.out.println("删除成功");
  }

  public static void addStudent(String name, String age, String address) {
    Student newStudent = new Student(name, age, address, studentArr.size());
    studentArr.add(newStudent);
    System.out.println("添加成功");
  }
}
