package OOPS;

public class B {
  int i; // 
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = a1; // copy reference
    a1.i = 10;
    System.out.println(a2.i);
    
    a2.i = 20;

    System.out.println(a1.i);
    
  }
}