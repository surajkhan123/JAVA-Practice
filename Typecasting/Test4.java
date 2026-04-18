package Typecasting;

public class Test4 {
  public static void main(String[] args) {
    System.out.println(m1()); // 9     [double to int] // Narrowing
    System.out.println(m2()); // 9.0   [int to double] // Widening
    
  }
  public static int m1(){
    return (int)9.5; // double to int [Narrowing]

  }
  public static double m2(){
    return 9; // int to double [widening]

  }
}
