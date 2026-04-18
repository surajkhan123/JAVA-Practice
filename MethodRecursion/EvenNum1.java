package MethodRecursion;

public class EvenNum1 {
  public static void main(String[] args) {
    m1(1);
    
  }
  public static void m1(int i){
    if(i>100) return ;
    if(i%2==0)
      System.out.println("Prime Numbs: "+i);
    m1(i+1);
  }
}
