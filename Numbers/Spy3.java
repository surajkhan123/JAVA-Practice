package Numbers;

public class Spy3 {
  public static void main(String[] args) {
    int count =0;
    for(int i=100;i>=1;i--){ // for 2nd highest 
      int n = i;
      int sum = 0;
  
      int product =1;

      while(n>0){
        int rev = n%10;
        sum = sum + rev;
        product = product * rev;
        n = n/10;

      } if(sum == product){
        count++;
        if(count==2){
          System.out.println("2nd Highest Spy no is: "+i);
        }
      }
      
    } 
  }
}
