package MethodOverloading;

public class AA {

  public static void m1(){
    System.out.println("m1()");
  }
  public static void m2(int n){
    System.out.println("m2(int n)"+n);
  }
  public static double m3(double d, int i){
    System.out.println("m3(double d,int i)"+d+","+i);
    return d + i; 

  }
  
  public static void main(String[] args) {
    m1();
    m2(5);
    m3(9.5,5);
    
  }
}
