package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;


public class SumOfEveryQueryRange {
        static class Query{
        int L;
        int R;
        Query(int L,int R){
            this.L = L;
            this.R = R;
        }
    }
    public  static  void printSumOfEveryQueryRange(int arr[], ArrayList<Query> q){
            int m = q.size();
            int n = arr.length;

            for(int i =0;i<m;i++){
                int L = q.get(i).L;
                int R = q.get(i).R;
                int sum =0;
                for(int j =L;j<=R;j++){
                    sum+=arr[j];
                }
                System.out.println("The sum of "+L+" and "+R+ " Range is = "+sum);
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,7,8,9};
        ArrayList<Query> q = new ArrayList<>();
        q.add(new Query(1,4));
        q.add(new Query(3,6));
        q.add(new Query(2,6));
        q.add(new Query(4,8));

        printSumOfEveryQueryRange(arr,q);



    }
}
