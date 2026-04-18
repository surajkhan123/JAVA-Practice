package MethodOverloading;

public class E {
  public static void main(String[] args) {
    // boolean result = m1(5,5);
    // System.out.println(result);
    System.out.println(m1(5,5));

    
  }

  public static boolean m1(int a, int b) {
    if(a==b) return true;
    return false;
  }
}
