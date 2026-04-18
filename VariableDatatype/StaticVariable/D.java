package VariableDatatype.StaticVariable;

public class D {
  static int i =10;
  public static void main(String[] args) {
    D.m1();
    D.i=20;
    D.m1();
    
  }

  public static void m1(){
    System.out.println("m1 starts");
    System.out.println(D.i);
    System.out.println("m1 ends");
  }
}
