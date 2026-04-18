package Numbers.PrimeNumber;

public class A {
  public static boolean isPrime(int n,int i){
    if (n==i) return true;
    if (n%i==0) return false;
    return isPrime(n,i+1);
  }
  public static void main(String[] args) {
    int n = 9;
    if(isPrime(n, 2)){
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }
  }
}
