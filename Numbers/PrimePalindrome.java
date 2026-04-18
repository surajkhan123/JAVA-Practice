package Numbers;

public class PrimePalindrome {
  public static boolean isPrime(int n){
    if(n<=1)
      return false;

      for(int i=2;i<=Math.sqrt(n);i++){
        if (n%i==0) return false;
      } return true;
  }
  public static boolean isPalindrome(int n){
    int rev =0; int original = n;
    while(n>0){
      int d = n%10;
      rev = rev*10+ d;
      n = n/10;      
    } return original == rev;
  }
  public static void main(String[] args) {
    int n = 181;
    if(isPrime(n) && isPalindrome(n))
    System.out.println("true");
  else
    System.out.println("false");

    
  }
}
