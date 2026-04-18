package Typecasting;

public class Test3 {
  public static void main(String[] args) {
    int a = 5;
    byte b = (byte)a;
    System.out.println(b); //Narrowing (big data type to small data type)
    double d = 5.6;
    byte e = (byte)d;
    System.out.println(e); //Narrowing (big data type to small data type)
    char c ='A';
    int f = (int)c;
    System.out.println(f); //Narrowing (big data type to small data type)


    
  }

}
