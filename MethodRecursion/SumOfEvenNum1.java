package MethodRecursion;

public class SumOfEvenNum1 {
  public static void main(String[] args) {
    int start =1; int end = 10;
    int sum = SumOfEvenNum(start,end);
    System.out.println("Enev Nums Sum is: "+sum);
    
  }
  public static int SumOfEvenNum(int i,int j){
    if(i>j) return 0;
      if(i%2==0){
    System.out.println(i);
    return i + SumOfEvenNum(i+1,j);

    } else {
      return SumOfEvenNum(i+1, j);
    }
    

  }
}
