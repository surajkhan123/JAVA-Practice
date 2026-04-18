package MethodOverloading;

public class F {
  public static void main(String[] args) {
    System.out.println(m1(5,5)); // true
    System.out.println(m1(5,6)); // false
    
  }
   public static boolean m1(int a,int b){
    return a==b;
   }
}
