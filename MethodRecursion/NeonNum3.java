package MethodRecursion;

public class NeonNum3 {
  public static void main(String[] args) {
    isRange(1,100);
    System.out.println(isNeon(0, 0, 0));
    
  }
  public static void isRange(int start,int end){
    if(start>end) return;
    int sq = start*start;

    if(isNeon(start, sq, 0))
      System.out.println(start);

    isRange(start+1,end);
  }
  public static boolean isNeon(int n,int sq,int sum){
    if(sq==0) return n==sum;
    sum +=sq%10;

    return isNeon(n, sq/10, sum);


  }
}
