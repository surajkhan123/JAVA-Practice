package Numbers.Spy;

public class B {
  public static void main(String[] args) {
    int n= 123; int m =n;
    int sum = 0;
    int prod = 1;

  while(n>0){
    int r = n%10;
    sum = sum +r;
    prod *= r;
    n /=10;
  } if(sum == prod) System.out.println("Spy"); else System.out.println("Not Spy");
  }
}
