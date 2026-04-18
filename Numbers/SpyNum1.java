package Numbers;

public class SpyNum1 {
  public static void main(String[] args) {
    int n =123;
    int sum =0; int prod =1;
    while(n>0){
      int d = n%10;
      sum = sum + d;
      prod = prod *d;
      n = n/10;

    } if(sum ==prod) System.out.println("Spy"); else System.out.println("Not Spy");
      // System.out.println(sum); System.out.println(prod);
  }
}
