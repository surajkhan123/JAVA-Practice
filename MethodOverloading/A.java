package MethodOverloading;
//only static method  not method overloading cause method name not same 
public class A {
  public static void main(String[] args) {
    m1();
    m2(5);
    m2(10);
    m3(5.6);
    m4(9.5,6);
  }

  public static void m1(){
    System.out.println("m1():");

  }
  public static void m2(int i){
    System.out.println("m2(int i):"+i);
  }
  public static void m3(double d){
    System.out.println("m3(double d):"+d);
  }
  public static void m4(double d, int i){
    System.out.println("m4(double d, int i):"+d+","+i);
  }
  
}


