package VariableDatatype.StaticVariable;

public class F {
  static int i;
  public static void main(String[] args){
    System.out.println(i); // refers static var
    int  i =10;
    System.out.println(i); // refers local var
    System.out.println(F.i);
  }
}
