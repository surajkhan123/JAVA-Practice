package WrapperClass;

public class Test2 {
  public static void main(String[] args) {
    Integer a = 10;
    int b = a; // auto-boxing

    System.out.println("Non Primitive(Wrapper): "+a);
    System.out.println("Primitive: "+b);

    Integer c = 20;
    int d = c.intValue();  // auto-unboxing(use before jdk 1.5)
    System.out.println("Non Primitive: "+c);
    System.out.println("Primitive: "+d);

    int n = new Integer(30); // auto-unboxing
    System.out.println("Primitive: "+n);
  }
}
