package Loops.Patterns;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
//            leading space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*n - (2*i-1)); j++) {
                if (i==1 || j ==1 || j == (2*n - (2*i-1)) || i==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
