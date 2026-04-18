package Return;

public class ArmStrong1 {
  public static void main(String[] args) {
    int n = 153;
    int len = length(n);

    if(isArm(n, len)) System.out.println(n+" is Armstrong");  else System.out.println(n+" is not Armstrong");
  }
  public static int length(int n){
    
    int count = 0;
    while(n>0){
      n /=10;
      count++;
    } return count;
    
  }
  public static boolean isArm(int n,int l){
    int m =n; int sum =0;
    while(m>0){
      int r = m%10;
      sum += Math.pow(r, l);
      m /=10;
    } return sum==n;
  }
}
