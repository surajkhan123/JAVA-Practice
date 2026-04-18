package MethodOverloading;

public class DD {
  public static void main(String[] args) {
    System.out.println(sq(6));
    System.out.println(sq(5));
    
  }
  public static int sq(int i){
    if(i%2==0) return i*i; // if even-> sq
    return i*i*i; // if odd-> que
  }
}
