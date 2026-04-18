package Numbers.OddEven;

public class C {
  public static void main(String[] args) {
    int n =6;
//using Bitwise Operator
    if((n & 1)==0)
      System.out.println("Even Number");
    else
      System.out.println("Odd Number");
  }
}
