package MethodRecursion;

public class NeonNum1 {
  public static void main(String[] args) {
    int n = 9;
    int sq = n*n;
    System.out.println(isNeon(n,sq,0));
  }
  public static boolean isNeon(int n,int sq,int sum){
    if(sq==0) return n == sum;

    sum += sq%10;
    return isNeon(n,sq/10,sum);

  
}
  
}
