//add two matrix

import java.util.Arrays;
import java.util.Scanner;


public class Sum2mat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no of rows you want to add in matrix : ");
        int rows = input.nextInt();
        System.out.print("enter the no of columns you want to add in matrix : ");
        int cols = input.nextInt();

        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] matrixsum = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("MATRIX 1 : enter the element you want at [" + row + "][" + col + "] : ");
                int element = input.nextInt();
                mat1[row][col] = element;
            }
        }
//        System.out.println("your first matrix is : " + mat1); -> this doesnt not give output the appropriate way

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(mat1[row][col] + " ");
            }
            System.out.println();
        } //this is one way to represent array

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("MATRIX 2 : enter the element you want at [" + row + "][" + col + "] : ");
                int element = input.nextInt();
                mat2[row][col] = element;
            }
        }
// second way to represent array will be to use array. -> because arrays.tostring only works for 1d array we have to itereate for every row. if you dont want to iterate for every row then consider the third way at the bottom

        for (int row = 0; row < rows; row++) {
            System.out.println(Arrays.toString(mat2[row]));
            }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrixsum[row][col] = mat1[row][col] + mat2[row][col];
            }
        }

// probably the simplest way to display a 2d array
        System.out.println("your required matrix which is the sum of two matrix is : ");
        System.out.println(Arrays.deepToString(matrixsum));
    }
}