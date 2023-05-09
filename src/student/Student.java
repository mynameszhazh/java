package src.student;

public class Student {
  private Number sid;
  private String name;
  private String age;
  private String address;

  public Student(String name, String age, String address, Number sid) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.sid = sid;
  }

  public Student() {

  }

  public String getName() {
    return this.name;
  }
  public String getAddress() {
    return this.address;
  }
  public String getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setAge(String age) {
    this.age = age;
  }
}