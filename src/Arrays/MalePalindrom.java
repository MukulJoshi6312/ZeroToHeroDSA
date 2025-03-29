package Arrays;

import java.util.Scanner;

public class MalePalindrom {

//    static int findMinOps(int[] arr, int n){
//
//        int ans =0;
//        int  left = 0;
//        int right = n-1;
//        while(left<=right){
//
//            if(arr[left] == arr[right]){
//                left++;
//                right--;
//            }
//            else if(arr[left]>arr[right]){
//                right--;
//                arr[right] += arr[right+1];
//                ans++;
//            }
//            else {
//                left++;
//                arr[left] += arr[left-1];
//                ans++;
//            }
//
//        }
//
//        return  ans;
//
//    }













    public static  int findMinOps(int arr[],int n){
        int ans =0;
        int l = 0;
        int r = n-1;
        while(l<r){
            if(arr[l] ==  arr[r]){
                l++;
                r--;
            }
            else if(arr[l] > arr[r]){
                r--;
                arr[r] = arr[r] + arr[r+1];
                ans++;
            }else{
                l++;
                arr[l] = arr[l] + arr[l-1];
                ans++;
            }
        }
        return  ans;
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

        int res = findMinOps(arr,size);
        System.out.println(res);
    }
}



//1, 4, 5, 9, 1}