package Numbers;

public class SpyNum2 {


  public static boolean isSpy(int n,int sum,int prod){
    if(n==0) return sum == prod;
    int d =n%10;
    sum = sum+d;
    prod = prod*d;
    n =n/10;
    return isSpy(n, sum, prod);

  }

  public static void main(String[] args) {
    int n = 123;
    // if(isSpy(n, 0, 1));
    System.out.println((isSpy(n, 0, 1)));
    if(isSpy(n, 0, 1)){
      System.out.println("Spy Number");
    } else {
      System.out.println("Not Spy Number");
    }
    
  }
}
