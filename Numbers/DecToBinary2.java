package Numbers;

public class DecToBinary2 {
  public static void main(String[] args) {
    // Interger Operation
    int n = 5;
    int bin =0;
    int i =1;

    while(n>0){
      int bit = n%2;
      bin = bit*i + bin;
      i =i*10;
      n = n/2;
      

    } System.out.println(bin);
  }
}
