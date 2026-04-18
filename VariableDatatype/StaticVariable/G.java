package VariableDatatype.StaticVariable;

public class G {
  int i;
  public static void main(String[] args) {
    // G g1 = new G();
    // System.out.println(g1.i);
    // g1.i = 10;
    // System.out.println(g1.i);

    G g1 = new G();
    g1.i=10;

    G g2 = new G();
    g2.i=20;

    System.out.println(g1.i);
    System.out.println(g2.i);
  }
  
}
