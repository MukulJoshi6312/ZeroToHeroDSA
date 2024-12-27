package TCS;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column number: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        long res = 1;
        for (int i = 1; i < row; i++) {
            res = res * (row + col - 1 - i) / i;
        }
        System.out.println(res);

    }
}
