package MethodRecursion;

public class Factorial1 {
  public static void main(String[] args){
    isFact(5,1);

  }

  public static void isFact(int i, int fact){
    if(i==0){
      System.out.println("Factorial is:"+fact);
      return;
    }
    fact *=i;
    isFact(i-1, fact);

      
  }
}
