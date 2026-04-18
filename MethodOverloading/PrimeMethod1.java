package MethodOverloading;

public class PrimeMethod1 {
  public static void main(String[] args) {
    range(1,100);
    
  }
  public static void range(int st,int end){
    for(int i=st;i<=end;i++){
      if(isPrime(i))
        System.out.println(i);
      
    }
  }

  public static boolean isPrime(int n){
    
    if(n<=1) return false;
    for(int i=2;i<=n/2;i++){
      if(n%i==0) return false;
    } return true;
  }
}
