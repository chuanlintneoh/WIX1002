import java.util.Scanner;
public class pascalTriangle {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal Triangle to generate: ");
        row = sc.nextInt();
        int[][] triangle = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = 0;
                }
            }
        }//fill in 1 into first column and 0 into others

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }//calculate pascal triangle

        System.out.println("The Pascal Triangle with " + row + " row(s)");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%d  ",triangle[i][j]);
            }
            System.out.println();
        }//display pascal triangle
    }
}
