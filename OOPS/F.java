package OOPS;

public class F {
    int i;
    int j;

    public void display(){
      A a = new A();
      System.out.println("i:"+a.i);
      System.out.println("j:"+a.j);
    }
  
  public static void main(String[] args) {
    F a1 = new F();
    a1.i = 10;
    a1.j = 20;
    F a2 = new F();
    a2.i = 30;
    a2.j = 40;
    a1.display();
    a2.display();
    
  }
}
