package question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        boolean[] result = new boolean[n];
        int max = -1;
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            max = Math.max(max, candies[i]);
        }
        int extraCandies = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            if(candies[i]+extraCandies>=max){
                result[i]=true;
            }else{
                result[i]=false;
            }
        }

        for(boolean element:result){
            System.out.print(element+" ");
        }
        
    }
}
