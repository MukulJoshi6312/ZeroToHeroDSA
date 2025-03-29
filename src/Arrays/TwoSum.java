package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
//using two pointers better approach
//    public  static int findTwoSum(int[] arr,int target){
//
//        int result = 0;
//        int start =0;
//        int last = arr.length-1;
//
//        while (start<last){
//            int sum = arr[start]+arr[last];
//            if(sum == target){
//                result = sum;
//                System.out.println(start+" "+last);
//                break;
//            }
//            else if(sum > target){
//                last--;
//            }else {
//                start++;
//            }
//        }
//        return result;
//
//    }


//    using hashing optimized approach

    public  static int[] findTwoSum(int[] arr,int target){


        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i =0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
//                System.out.println(i+" "+map.get(target-arr[i]));
                return  new int[]{i,map.get(target-arr[i])};

            }
        }
        return new int[]{-1,-1};

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
        int target = 17;
//        2 5 7 11 15
        int result[] = findTwoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }
}
