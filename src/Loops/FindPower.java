package Loops;

import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int p = sc.nextInt();

        int res = 1;
        for (int i = 1; i <= p; i++) {
            res  = res *n;
        }
        System.out.println(res);
    }

}
