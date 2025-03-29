package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayExceptSelf {

//    public static  int[] productArray(int arr[]){
//        int num[] = new int[arr.length];
//       for(int i =0;i<arr.length;i++){
//           int por = 1;
//           for (int j =0;j<arr.length;j++){
//               if(i!=j) {
//                   por *= arr[j];
//               }
//
//           }
//           num[i] = por;
//       }
//       return num;
//    }
//tc =O(N^2) space timecomplixity = O(N)

//    time complexity = O(N)
//    space timecompleity 0(fN)
//    public static  int[] productArray(int arr[]){
//        int num[] = new int[arr.length];
//        int pro =1;
//        for(int i=0;i<arr.length;i++){
//            pro *= arr[i];
//        }
//        for(int i =0;i<arr.length;i++){
//            num[i] = pro/arr[i];
//        }
//        return num;
//    }

//    using without division and using prefix and suffix product array
//public static  int[] productArray(int arr[]){
//    int n = arr.length;
//    int ans[] =new int[n];
//
//    int prefix[] = new int[n];
//    int suffix[] = new int[n];
//
//    prefix[0] = 1;
//
//    for(int i =1;i<n;i++){
//        prefix[i] = prefix[i-1] * arr[i-1];
//    }
//    suffix[n-1] = 1;
//    for(int i =n-2;i>=0;i--){
//        suffix[i] = suffix[i+1] * arr[i+1];
//    }
//    for(int i =0;i<n;i++){
//        ans[i] = prefix[i] * suffix[i];
//    }
//    return  ans;
//
//}


//    optimal approach without using S_C O(1) T_C O(N)

    public static  int[] productArray(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;

        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        int suffix =1;
        for(int i =n-2;i>=0;i--){
            suffix *= arr[i+1];
            ans[i] *= suffix;
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

       int ans[] = productArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
