package Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindKthLargetsElement {

    public  static int secondAndFirstLargestSmallest(int arr[]){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i =0;i<arr.length;i++){
                if(arr[i]>max){
                    secondMax = max;
                    max = arr[i];
                }
                else if(arr[i] > secondMax && secondMax != max){
                    secondMax = arr[i];
                }
                if(min>arr[i]){
                    secondMin = min;
                    min = arr[i];
                }
                else if(secondMin>arr[i] && secondMin != min){
                    secondMin = arr[i];
                }
        }
        System.out.println("Max = "+max+" "+" Second max "+secondMax);
        System.out.println("Min = "+min+" "+" Second min "+secondMin);

        return max;

    }

    public static int findKthLargestNumber(int arr[],int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(arr[i]< pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        return pq.peek();

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
        int k =4;
//        int res = secondAndFirstLargestSmallest(arr);
//        System.out.println(res);
         int  res = findKthLargestNumber(arr,k);
        System.out.println(res);
    }
}
