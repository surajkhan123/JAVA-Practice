package Numbers.PrimeNumber;

public class AA {
  public static boolean isPrime(int n,int i){
    if (i==1) return true;
    if(n<=1 || n%i==0) return false;

    return isPrime(n, i-1);
  }

  public static void main(String[] args) {
    int n = 9;
    System.out.println(isPrime(n, n/2));
  }
}
