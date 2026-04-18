package MethodRecursion;

public class Sum1 {
  public static void main(String[] args) {
    Sum(5,0);
     
  }
  public static void Sum(int n,int sum){
    if(n==0) {
      System.out.println(sum);
    return;
    }
      

    sum = sum +n;
    Sum(n-1,sum);

  }
}
