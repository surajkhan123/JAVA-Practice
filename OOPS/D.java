package OOPS;

public class D {
  int i =10;
  static int j = 20;

  public static void m1(){
    // System.out.println(i);
    System.out.println(j);
  }
  public void m2(){
    System.out.println(i);
    System.out.println(j);
  }

  public static void main(String[] args) {
    new D().m2();
    
  }
}
