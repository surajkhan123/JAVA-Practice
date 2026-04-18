package VariableDatatype.StaticVariable;

public class H {
  static int i; int j;
  public static void main(String[] args) {
    H h1 =new H();
    H h2 = new H();
    h1.j =10;
    h2.j=20;

    System.out.println(h1.j); //10
    System.out.println(h2.j); //20

    h1.i =10;
    h2.i = 20;
    System.out.println(h1.i); //20
    System.out.println(h2.i); //20

    System.out.println("1"+2+3);

  }
}
