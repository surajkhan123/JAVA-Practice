package MethodOverloading;

public class Demo1 {
  public static void main(String[] args) {
    m1();
    m1(5);
    m1(5+6);

    Demo1 d= new Demo1(); // created an object for non-static method()
    d.m1(10,5); 
    
  }
  public static void m1(){ //static method()
    System.out.println("m1()");

  }
  public static void m1(int i){ //static method()
    System.out.println("m1(int i)"+i);

  }
  public  void m1(int i, int j){ //non-static method()
    System.out.println("m1(int i, int j)"+i+","+j);

  }
  public static int m1(int i,int j,int k){ //static method()
    System.out.println("m1(int i, int j, int k)"+i+","+j+","+k);
    return i+j+k;

  }
}
