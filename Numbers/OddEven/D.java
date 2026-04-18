package Numbers.OddEven;

public class D {
  public static void main(String[] args) {
    int n =6;
    // System.out.println(isEven(n));
    if(isEven(n))
    System.out.println("Even Number");
  else
    System.out.println("Odd Number");

  }
  public static boolean isEven(int n){
    if(n%2==0) return true;
    else 
      return false;
}
}
