package Numbers.Spy;

public class Spy1 {
  public static boolean isSpy(int n,int sum, int prod){
    if(n==0) return sum == prod;

    sum+= n%10;
    prod*=n%10;

    n = n/10;
    return isSpy(n,sum,prod);

  }
  public static void main(String[] args) {
    int n = 123;
    System.out.println(isSpy(n,0,1));
  }
}
