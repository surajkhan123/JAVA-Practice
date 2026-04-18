package Numbers.ArmStrong;

public class AB {
  public static void main(String[] args) {
     int n = 154; int temp = n;

    //  for(int i=0;i<=Math.sqrt())

    int digits = 0;
    int t = n;
    while(t>0){
      digits++;
      t /=10;
    }

    int sum =0;
    while(n>0){
      int d =n%10;
      sum += Math.pow(d, digits);
      n /=10;
    } boolean result = (sum == temp); System.out.println(result);
    
    if(sum == temp) System.out.println("Armstrong Number");
    else System.out.println("Not Armstrong Number");
  }
}
