package src.examples.test;

class Solution {
  public static void main(String[] args) {

    useIndex(System.out::println);
  }

  private static void useIndex(indexImp i) {
    i.test("testTest");
  }
}