package Typecasting;

public class Test2 {
  public static void main(String[] args) {
    m1(5); // integer to double
    m1(2.5f); // float to double
    m1(5.6); // double to double
    m1('A'); // char to double
    m1(5+3.3);  // int & double to double

    m2(5); m2((long)2.3f); 
    m2((long)5.6);  m2('A');
    
  }
  public static void m1(double d){
    System.out.println("m1(double) d:"+d);
  }
  public static void m2(long l){
    System.out.println("m1(Long l)"+l);
  }
}
