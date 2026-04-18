package Numbers;

public class Tribonaci1 {
  public static void main(String[] args) {
    int a =0, b=1, c=1;
    System.out.println(a+" "+b+" "+c+" ");
    for(int i=4;i<=10;i++){
      int d = a+b+c;
      System.out.println(d);
      a =b;
      b =c;
      c=d;
    }
  }
}
