package MethodOverloading;
// created a method(Parameterised) for even-> sq & odd->cube
public class D {
  public static void main(String[] args) {
    System.out.println(sq(5));
    System.out.println(sq(4));
    
  }

  public static int sq(int i){
    if(i%2==0) return (int)Math.pow(i, 2); // or return i*i;
  
    //return i*i*i; or 
    return (int)Math.pow(i,3);
  }
}
