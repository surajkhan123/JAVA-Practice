package Numbers;

public class Spy2 {
  public static void main(String[] args) {

    int count =0;
    for(int i=100;i<=1000;i++){ // for second smallest no 
      int n = i ;
      int sum =0;
      int prod = 1;

      while(n>0){
        int r = n%10;
        sum = sum +r;
        prod = prod * r;
        n = n/10;

      }
      if(sum== prod){
        count++;
        if(count==2){
          System.out.println("2nd Smallest Spy no is: "+i);
          break;
        }
      }


    }
  }
}
