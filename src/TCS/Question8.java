package TCS;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();

        if (num % divisor == 0) {
            System.out.println(num);
            return;
        }
        int lower = num - (num % divisor);
        int upper = lower + divisor;

        int result = num-lower <= upper -num ? lower : upper;
        System.out.println(result);
    }

}
