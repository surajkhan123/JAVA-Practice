package Numbers.DecimalBinary;

public class DecToBin1 { // using String operation
  public static void main(String[] args) {
    int n = 25;
    String s = " ";
    while(n>0){
      int bin = n%2;
      s = bin+s;
      n /=2;

    } System.out.println(s);
    
  }
}
