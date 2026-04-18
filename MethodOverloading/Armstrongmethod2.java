package MethodOverloading;

public class Armstrongmethod2 {
  public static void main(String[] args) {
    int n =153;

    if(isArmstrong(n))
      System.out.println(n+" is Armstrong Num");
    else 
      System.out.println(n+" is not Armstrong Number");
    
  }
  public static boolean isArmstrong(int n){
    int temp = n;
    int count =0;

    while(temp>0){
      count++;
      temp = temp/10;
    }
    temp = n;
    int sum = 0;

    while(n>0){
      int digit  = n%10;
      sum = sum + (int)Math.pow(digit,count);
      n = n/10;
    }
    return sum == temp;
  }
}
