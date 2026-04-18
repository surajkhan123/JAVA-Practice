package Numbers;

public class DecToBinary4 {
  public static void main(String[] args) {
    int n = 5;
    int rem = 0;
    int bin =0;
    int rev = 1;
    while(n>0){
      rem = n%2;
      n = n/2;
      bin = bin + rem * rev;
      rev = rev *10;

      

    } System.out.println(bin);
  }
}
