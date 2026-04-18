package MethodOverloading;

public class OddEven1 {
  public static void main(String[] args) { 

    int n=9;
    if(isEven(n))
      System.out.println("Even");
    else System.out.println("Odd");

    
  }

  public static boolean isEven(int i){
    return i%2==0;
  }
}
