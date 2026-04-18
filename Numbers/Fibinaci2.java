package Numbers;

public class Fibinaci2 {
  public static void main(String[] args) {

    int a = 0, b = 1;

    while(a <= 10){
      System.out.print(a + " ");
      int c = a + b;
      a = b;
      b = c;
    }
  }
}