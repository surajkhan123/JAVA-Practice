package Numbers.FibonacciSeries;

public class B {
  public static void main(String[] args) {
    int a =0, b = 1, c = 1;
    System.out.println(a+"\n"+b+"\n"+c+"");
    for(int i=4;i<=10;i++){
      int d = a+b+c;
      a=b; b=c; c=d;
      System.out.println(d);
    } 
  }
}
