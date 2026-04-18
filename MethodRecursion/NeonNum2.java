package MethodRecursion;

public class NeonNum2 {
  public static void main(String[] args) {
    int start=1;
    int end = 100;
    for(int i = start;i<=end;i++){
      int sq = i*i;

      if(isNeon(i, sq, 0)){
      System.out.println(i);
    }
    
    }
  }
  public static boolean isNeon(int n, int sq,int sum){

    if(sq==0) return n ==sum;
    sum+= sq%10;
    return isNeon(n,sq/10,sum);
  }
}
