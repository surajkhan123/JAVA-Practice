package Return;

public class A {
  public static void main(String[] args) {
    // System.out.println(isEven(6)); or 
    if(isEven(6)) System.out.println("Even Num"); else System.out.println("Odd Num");
    
  }
  public static boolean isEven(int n){
    if(n%2==0) return true;
    return false;
  }
}
