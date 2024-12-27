package Loops;

import java.util.Scanner;

public class HFC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int num1 = input.nextInt();
        System.out.println("Enter the elements you wish to enter: ");
        int num2 = input.nextInt();
        int min = Math.min(num1, num2);
        int hcf = 1;
        for (int i = 1; i <= min; i++) {
            if (num1%i == 0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);

    }
}
