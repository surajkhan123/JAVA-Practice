package MethodRecursion;

public class Test2 {
  public static void main(String[] args) {
    m1(1);
    
  }

  public static void m1(int n){
    if(n>10) return;
    System.out.println(n);
    m1(n+1);
          
  }
}
