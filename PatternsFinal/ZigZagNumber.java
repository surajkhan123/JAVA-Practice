package PatternsFinal;

public class ZigZagNumber {
  public static void main(String[] args) {
    int n = 5;
    int num =1;

    for(int i=1;i<=n;i++){
      int start = num;
      int[] arr = new int[i];

      for(int j=0; j< i;j++){
        arr[j] = num;
        num++;
      }

      //print row
      if(i%2==0){
        //reverse order for even num
        for(int j= i-1;j>=0;j--){
          System.out.print(arr[j]+" ");
        } 
      } else{
        //normal order for odd num
        for(int j=0;j<i;j++){
          System.out.print(arr[j]+" ");
        }
      } System.out.println();
      // 1
      // 3 2
      // 4 5 6
      // 10 9 8 7
      // 11 12 13 14 15
    }
  }
}
