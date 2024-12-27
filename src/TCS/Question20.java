package TCS;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number n & m :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n>m){
            int temp = n;
            n = m;
            m = temp;
        }
        int sum = 0;
        for(int i = n; i<=m; i++){
            sum += (int) Math.pow(i,3);
        }
        System.out.println(sum);
    }
}
