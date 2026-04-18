package Numbers;

public class Prime3 {
  public static void main(String[] args) {
    // int n =5;
    
    int count =0;
    for(int i =2;i<=100;i++)
    {
      boolean flag =true;
      for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0){
        flag = false;
        break;
      }
      }
      if(flag)
        {
        count++;
        if(count==2){    // for 2nd number(smallest/largest)
          // System.out.println("2nd Smallest no is:"+i);
        }
        if(count%2!=0){  // for alternate no 
          System.out.println(i);
        }
      }      
      
    } 
  
  }
}
