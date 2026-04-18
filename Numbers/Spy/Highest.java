package Numbers.Spy;

public class Highest {
  public static void main(String[] args) {
    int st =1000, end =100;
    for(int i=1000;i>=100;i--){
      
    int n=i; int m =n;
    int sum = 0;
    int prod = 1;

  while(n>0){
    int r = n%10;
    sum = sum +r;
    prod *= r;
    n /=10;
  } if(sum == prod){
     System.out.println(i); 
     break;
  }
  } 
}
}

 
