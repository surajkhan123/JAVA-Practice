public class PerfectNum2 {
  public static void main(String[] args) {
    int n = 6;
    int sum = 0;

    for(int i = 1; i <= Math.sqrt(n); i++){
      if(n % i == 0){

        sum += i;

        int pair = n / i;

        if(pair != i && pair != n){
          sum += pair;
        }
      }
    }

    if(sum == n){
      System.out.println("Perfect No");
    } else{
      System.out.println("Not Perfect No");
    }
  }
}
  
