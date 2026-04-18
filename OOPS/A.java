package OOPS;

public class A {
  int i;   //instance variable
  static int j;  //class variable
  public static void main(String[] args) {
    A a1 = new A();
    a1.i = 10;
    a1.j = 20;

    System.out.println(a1.i);
    System.out.println(a1.j);

    A a2 = new A();
    System.out.println(a2.i);
    System.out.println(a2.j);

    // A a3 = new A();
    // System.out.println(a3.i);
    // System.out.println(a3.j);
  }
  
}
