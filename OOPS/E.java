package OOPS;

public class E {
  int i = 10;
  static int j = 20;
  public static void m1(){
    // System.out.println(i); // CTE
    System.out.println(j);
  }

  public static void m2(){
    // System.out.println(i);// CTE
    System.out.println(j);
  }
  public static void main(String[] args) {
    // new E().m1();
    new E().m2();
  }
}
