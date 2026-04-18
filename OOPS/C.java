package OOPS;

public class C {
  public static void main(String[] args) {
    new A(); // abandone objectr
    new A().i = 10;
    System.out.println(new A().i); // 0  Object তৈরি হলো → কিন্তু কোথাও store করা হয়নি → Garbage হয়ে যাবে


  }
}
