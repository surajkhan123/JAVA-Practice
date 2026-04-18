package Numbers.FibonacciSeries;

public class A { 
  public static void main(String[] args) {
    int a=0, b =1;  // fibonacci series
    
    System.out.println(a+"\n"+b+"");
    for(int i=3;i<= 10;i++){
      int c = a+b;
      System.out.println(c);
      a=b;
      b =c;
    } 
  }
}
