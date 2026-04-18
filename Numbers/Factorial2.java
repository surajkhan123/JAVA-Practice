// package Numbers;

public class Factorial2 {
  public static void main(String[] args) {
    int n =5;
    int fact =1;
    // for(int i=1;i<=5;i++)
    for(int i=n;i>=1;i--)
    {
      fact = fact * i;
    }
    System.out.println("Factorial of "+n+" = " +fact);
  }
}
