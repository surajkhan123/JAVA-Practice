package Numbers.ArmStrong;

public class AA {
  public static void main(String[] args) {

    int st =1; int end = 1000;

    for(int i=st;i<=end;i++){
      if(isArmStrong(i)){
        System.out.println(i);
      }
    }
    
    // int n = 153;
    // if(isArmStrong(n))
    //   System.out.println("Armstrong Number");
    // else
    //   System.out.println("Not Armstrong Number");
  }

  public static boolean isArmStrong(int n){

    int temp = n;

    int digits = 0;
    int t = n;
    while(t>0){
      digits++;
      t/=10;
    }

    int sum =0;
    while(n>0){
      int digit = n%10;
      sum += Math.pow(digit, digits);
      n /=10;
    } return sum == temp;
  } 
}
