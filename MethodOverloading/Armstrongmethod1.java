package MethodOverloading;

public class Armstrongmethod1 {
  public static void main(String[] args) {
    int n =154;

    if(isArmstrong(n))
      System.out.println(n+" is Armstrong Num");
    else 
      System.out.println(n+" is not Armstrong Num");
    
  }
  public static boolean isArmstrong(int n){
    int temp =n;
    int sum =0;

    while(n>0){
      int digit = n%10;
      sum = sum + digit*digit*digit ;// for 3 digit
      n = n/10;
    }
    return temp == sum;
  }

}
