package Arrays;

import java.util.Scanner;

public class BestTimeToBuyAndSellStocks {

    private static  int MaxProfit(int arr[]){

        int profit = 0;
        int minSoFar = arr[0];
        for(int i =0;i<arr.length;i++){
//            minSoFar = Math.min(minSoFar,arr[i]);
//            profit = Math.max(profit,arr[i] - minSoFar);

            if(arr[i] <  minSoFar){
                minSoFar = arr[i];
            }
            if(profit < arr[i]-minSoFar){
                profit = arr[i]-minSoFar;
            }

        }
        return profit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        System.out.println("Enter the element into the array :");
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int result = MaxProfit(arr);
        System.out.println("Max profit : "+result);

    }
}
