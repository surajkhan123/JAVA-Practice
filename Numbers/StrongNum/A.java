package Numbers.StrongNum;

public class A {
  public static void main(String[] args) {
    int count =0;
    for(int num=1;num<=1000;num++){
    // int  n = 145;
     int  n = num;
    int m = n;
    int sum = 0;
    
    
    while(n>0){
      int rev = n%10;
      int prod = 1;
      for(int i=1;i<=rev;i++){
        prod *=i;
      }
      sum +=prod;
      n = n/10;
    }
    if(sum == m){
    //    System.out.println("Strong");
    // else 
    //   System.out.println("Not Strong");
    count++;
    if(count%2!=0){
    System.out.println(m);}
    }
  }
}
}
