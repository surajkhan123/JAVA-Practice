package MethodRecursion;

public class SpyNum1 {
  public static void main(String[] args) {
    int n = 1124;
    System.out.println(isSpy(n, 0, 1));
    
  }
   public static boolean isSpy(int n, int sum,int prod){
    if(n==0) return sum == prod;
    sum+=n%10;
    prod*=n%10;
    return isSpy(n/10, sum, prod);
   }
}
