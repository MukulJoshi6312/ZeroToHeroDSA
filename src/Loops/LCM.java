package Loops;

import java.util.Scanner;

public class LCM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int max = 0;
        if (num1 > num2){
            max = num1;
        }else {
            max = num2;
        }

        int i = max;
        int lcm = max;
        while(true){
            if(i%num1 == 0 && i%num2 == 0){
                lcm =i;
                break;
            }
            i+=max;
        }
        System.out.println(lcm);
    }
}
