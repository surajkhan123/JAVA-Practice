package MethodOverloading;

public class EE {
  public static void main(String[] args) {

    System.out.println("Main Start");
    for(int i=1;i<=10;i++){
      if(i==5) return;
      System.out.println("i"+i);
    }  System.out.println("Main ends");
    
  }

}
