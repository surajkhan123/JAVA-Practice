package MethodRecursion;

public class Test1 {
  public static void main(String[] args) {
    m1(1);
    // m1(1);m1(2); m1(3); m1(4); m1(5); r bodole-->  m1(i+1); 
    
  }
  public static void m1(int i){
    if(i>5) return;
    System.out.println(i);
    m1(i+1);
  }
}
