package Typecasting;

public class Test1 {
  public static void main(String[] args) {
    byte a =10; // 1 byte
    int b =a; // 4 byte
    System.out.println(a+" is: "+b); //widening

    int c =5; // 4 byte
    double d =b; // 8 byte
    System.out.println(c+" is: "+d); //widening

    char ch = 'A';  //not "A"
    int m =ch;
    System.out.println(ch+" is: "+m); //widening

  }
}
