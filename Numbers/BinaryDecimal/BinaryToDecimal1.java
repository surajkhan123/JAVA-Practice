package Numbers.BinaryDecimal;

public class BinaryToDecimal1 {
  public static void main(String[] args) {
    int n =1001;
    int sum = 0; int i =1;
  while(n>0){
    int d = n%10;
    sum = sum + d*i;
    i = i*2;

    n = n/10;
  } System.out.println(sum);

  }
}
