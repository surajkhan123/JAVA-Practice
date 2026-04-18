package Encapsulation.SingleToneClass;
class B{
  private static B b; // to make SingleTone class
  int i;

  private B(){
    i = 20;
    System.out.println(i);
  }
  public static  B getObject(){
    if(b==null) b = new B();
    return b;

  }
}

public class TestSingleTone2 {
  public static void main(String[] args) {
    B b1 = B.getObject();
    B b2 = B.getObject();
    System.out.println(b1==b2); // true
    System.out.println(b1);
    System.out.println(b2);

  }
  
}
