package MethodOverloading;

public class PrimeMethod2 { // Alternate prime no print
  public static void main(String[] args) {
    // int n = 5;
    range(1,100);
    
  }
  public static void range(int st,int end){
    int count =0;
    for(int i=st;i<=end;i++){
      if(isPrime(i)){
        count++;
        if(count%2!=0){
          System.out.println(i);
        }
      }
    }
  }
  

  public static boolean isPrime(int n){
    if(n<=1) return false;
    for(int i =2;i<=n/2;i++){
      if(n%i==0) return false;
    }return true;
  }
}
