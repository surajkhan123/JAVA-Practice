package MethodOverloading;

public class OddEven2 {
  public static void main(String[] args) {
    int n =10;
    System.out.println(isEven(n));
    
  }
  public static boolean isEven(int i){
    if(i%2==0){return true;}
    else {
    return false;
    }
  }
}
