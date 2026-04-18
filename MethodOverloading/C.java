package MethodOverloading;

public class C {
  public static void main(String[] args) {
    System.out.println(add(5, 4));
    System.out.println(add(7,6));
  }

  public static int add(int i,int j){
    return i+j;
  }

  
}