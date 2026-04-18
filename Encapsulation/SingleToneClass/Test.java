package Encapsulation.SingleToneClass;

class A{
  private static A a;
  int i;

  private A(){
    
    i = 10;
    System.out.println(i);
  }
  public static A getObject(){
    if (a==null) a = new A();
    return a;
  }
}
public class Test {
  public static void main(String[] args) {
    A a1 = A.getObject();
    A a2 = A.getObject();
    System.out.println(a1==a2); // true
    System.out.println(a1);
    System.out.println(a2);
  }

  
}


// package Encapsulation.SingleToneClass;

// class A{
// private static A a;
//   int i;
//   private  A(){
//     i = 25;
//     System.out.println(i);
//   }
//   public static A getObject(){
  // if(a == null) a = new A();
//     return a;
//   }
// }
// public class Test {
//   public static void main(String[] args) {
//     A a1 = A.getObject();
//     A a2 = A.getObject();
//     System.out.println(a1==a2); // true
//     System.out.println(a1);
//     System.out.println(a2);
//   }
// }