package Numbers.BinaryDecimal;

public class DecToBinary1 {
  public static void main(String[] args) {
    int n = 25;
     int sum = 0; int i = 1;
    while(n>0){
     int rev = n%2;
      sum = sum + rev*i;
      n=n/2;
      i*=10;
    } System.out.println(sum);
  }
  
}
