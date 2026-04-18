package Numbers;

public class Reverse1 {
  public static void main(String[] args) {
    int n = 121;
    int m =n;
    int rev =0;
    
    while(m>0){
      rev = rev * 10 + m%10;
      m = m/10;
    } System.out.println(rev);
    
  }
}
