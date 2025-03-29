package Arrays;

import java.util.Arrays;

public class Nextpermutation {
    public  static  void revers(int[] arr,int l , int r){
        while (l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static  void swap(int[] arr,int l , int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }
    public static void main(String[] args) {
        int arr[] = {2,3,1};
        int n = arr.length;
        int pi=-1;
        for(int i =n-2;i>=0;i--){
           if(arr[i] < arr[i+1]){
               pi = i;
               break;
           }
        }


        if(pi != -1){
            for(int j =n-1;j>pi;j--){
                if(arr[j]>arr[pi]){
                    int temp = arr[j];
                    arr[j] = arr[pi];
                    arr[pi] = temp;
                    break;
                }
            }
        }

        revers(arr,pi+1,n-1);
        System.out.println(Arrays.toString(arr));

    }
}
