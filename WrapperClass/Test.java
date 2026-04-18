package WrapperClass;

// Auto boxing: the process of converting primitive data in corresponding wrapper is called auto boxing

public class Test {
  public static void main(String[] args) {
    byte a =10;
    Byte b = a; // auto-boxing

    System.out.println("Primitive:"+a);
    System.out.println("Non-Primitive: "+b);

    int c = 20;
    Integer d = Integer.valueOf(c);  // box (use before jdk 1.5)
    System.out.println("Primitive: "+c);
    System.out.println("Wrapper(Non-Primitive): "+d);

    Integer n = 30;
    System.out.println("Non Primitive: "+n);
  }
  
}
