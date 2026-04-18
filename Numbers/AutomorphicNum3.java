// public package Numbers;

import java.util.Scanner;

class AutomorphicNum3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start range:");
        int st = sc.nextInt();

        System.out.println("Enter End range:");
        int end = sc.nextInt();

        for(int i=st;i<=end;i++){
            int n =i;
            int sq= n*n;
            boolean flag = true;
            while(n>0){
                if((n%10) != (sq%10)){
                    flag = false;
                    break;

                }
               n =  n/10;
               sq =  sq/10;
            }
            if(flag) {System.out.println(i);}
            
        } 
        
    }
}