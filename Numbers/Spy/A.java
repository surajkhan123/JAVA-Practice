package Numbers.Spy;

public class A {
  public static void main(String[] args) {
    int st =100, end =1000;
    for(int i=st;i<=end;i++){
      
    int n=i; int m =n;
    int sum = 0;
    int prod = 1;

  while(n>0){
    int r = n%10;
    sum = sum +r;
    prod *= r;
    n /=10;
  } if(sum == prod) System.out.println(i);
  }
}
}

 
