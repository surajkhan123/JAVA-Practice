package ParseMethod;

public class Test {
  public static void main(String[] args) {
    String s1 = "10";
    String s2 = "9.5";
    String s3 = "true";

    int i = Integer.parseInt(s1);
    double j = Double.parseDouble(s2);
    boolean k = Boolean.parseBoolean(s3);

    System.out.println(i+"\t"+j+"\t"+k);
    
  }
}
