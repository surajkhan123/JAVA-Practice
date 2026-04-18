package Numbers;
import java.util.*;

public class Emrip1 {
  
public static boolean isPrime(int n){
  if(n<=1) return false;

  for(int i=2;i<=Math.sqrt(n);i++) // for(int i=2;i<n;i++)
    {
    if(n%i==0)
      return false;
  } return true;
}

public static boolean isEmrip(int n){
  int rev = 0;
  int temp = n;
  int d = 0;
  while(temp>0){
    d = temp%10;
    rev = rev*10 + d;

    temp = temp/10;

  } System.out.println("Reverse Num"+rev);
  return n!= rev && isPrime(n) && isPrime(rev);
  

}
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number to check Emrip or Not: ");
    int n =  sc.nextInt();
    
    if (isEmrip(n)){
      System.out.println("Emrip Num");
    } else {
      System.out.println("Not Emrip Num");
    }

  }
}
