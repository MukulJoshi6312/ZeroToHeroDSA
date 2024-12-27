package Loops;

import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;
        System.out.print(num1+", "+num2);
        for(int i =2;i<n;i++){
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            System.out.print(", "+temp);
        }
    }
}
