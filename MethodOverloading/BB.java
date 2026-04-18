package MethodOverloading;

public class BB {
  public static void main(String[] args) {
    m1();
    int n = m2();
    System.out.println(n);
    
  }
  public static void m1(){
    System.out.println("m1() is executed");
  }
  public static int m2(){
    System.out.println("m2() is executed");
    return 9;
  }
}
