package MethodRecursion;

public class Test3 {
  public static void main(String[] args) {
    m1(1);
    
  }
  public static void m1(int n){
    if(n>10) return;
    m1(n+1);
    System.out.println(n);
    

  }
  
}
