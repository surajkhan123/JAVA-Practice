package Numbers.DecimalBinary;

public class DecToBin2 {
  public static void main(String[] args) {
    int n =  25; int i =1;
    int bin = 0;
    while(n>0){
      int d = n%2;
      bin  = bin +d*i;
      n /=2;
      i *=10;
    } System.out.println(bin);
  }
}
