public class matrix_Rotate90degree {
    public static void main(String[] args) {
        final int ROW = 3;
        int[][] matrix = { {1, 5, 7}, {3, 6, 9}, {5, 3, 8} };
        int[][] matrix_rotated = new int[3][3];

        System.out.println("3 by 3 Matrix");
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<ROW; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }

        for(int i=0; i<ROW; i++)
            for(int j=0; j<ROW; j++)
                matrix_rotated[i][j] = matrix[2-j][i];

        System.out.println("After rotates 90 degrees clockwise ");
        for(int i=0; i<ROW; i++) {
            for(int j=0; j<ROW; j++)
                System.out.print(matrix_rotated[i][j] + "  ");
            System.out.println();
        }
    }
}
