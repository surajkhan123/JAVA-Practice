//package toString();

public class C {
  int i, j;
  public C(int i,int j){
    this.i = i;
    this.j = j;
  }
  @Override
  public String toString(){
    return i+", "+j;

  }
  

  public static void main(String[] args) {
    C a1 = new C(10,20);
    System.out.println(a1.toString());
    
  }
}
