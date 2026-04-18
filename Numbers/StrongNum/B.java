package Numbers.StrongNum;

public class B {
  public static void main(String[] args) {
    int st = 1, end = 10000;
    for(int k = st;k<=end;k++){
    
    int n = k; int m = k;
    int sum =0;
    while(n>0){
      int d = n%10;
      int prod = 1;
      for(int i =1;i<=d;i++){
        prod*=i;
      } sum += prod;
    
      n /=10;
    } if(sum == m) System.out.println(m);
    // {
    //   System.out.println("Strong Number");
    // } else { System.out.println("Not Strong");}
  }
  }
}
