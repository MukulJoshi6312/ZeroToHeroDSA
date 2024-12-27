package TCS;
import java.util.Arrays;
import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row = sc.nextInt();
        System.out.println("Enter the column number: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];

        System.out.println("Enter the matrix contents: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

//        System.out.println("The matrix is: "+ Arrays.deepToString(matrix));
        int max =0;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
//            System.out.println(count);
        }
        System.out.println(max+" "+index);

    }
}
