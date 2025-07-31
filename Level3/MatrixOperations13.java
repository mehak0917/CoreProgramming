package JavaMethods.Level3;

import java.util.Scanner;

public class MatrixOperations13 {
    static Scanner sc = new Scanner(System.in);

    // Method to create a random matrix
    static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j] = (int)(Math.random()*10); // Random 0-9
            }
        }
        return matrix;
    }

    // Method to display matrix
    static void displayMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Add matrices
    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Subtract matrices
    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[0].length;j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Multiply matrices
    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = b.length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                for(int k=0;k<common;k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Transpose matrix
    static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Determinant of 2x2 matrix
    static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // Determinant of 3x3 matrix
    static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
                m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
                m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        if(det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // Display double matrix
    static void displayDoubleMatrix(double[][] matrix) {
        for(double[] row : matrix) {
            for(double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = null, B = null;
        while(true) {
            System.out.println("\n--- Matrix Operations Menu ---");
            System.out.println("1. Create Matrices A & B");
            System.out.println("2. Display Matrices");
            System.out.println("3. Add Matrices");
            System.out.println("4. Subtract Matrices");
            System.out.println("5. Multiply Matrices");
            System.out.println("6. Transpose Matrix A");
            System.out.println("7. Determinant (2x2 or 3x3)");
            System.out.println("8. Inverse (2x2 only)");
            System.out.println("9. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter rows and columns: ");
                    int r = sc.nextInt(), c = sc.nextInt();
                    A = createMatrix(r, c);
                    B = createMatrix(r, c);
                    System.out.println("Matrices created.");
                    break;
                case 2:
                    System.out.println("Matrix A:");
                    displayMatrix(A);
                    System.out.println("Matrix B:");
                    displayMatrix(B);
                    break;
                case 3:
                    displayMatrix(addMatrices(A, B));
                    break;
                case 4:
                    displayMatrix(subtractMatrices(A, B));
                    break;
                case 5:
                    System.out.print("Enter cols for B to multiply with A: ");
                    int bCols = sc.nextInt();
                    B = createMatrix(A[0].length, bCols);
                    System.out.println("Matrix B:");
                    displayMatrix(B);
                    displayMatrix(multiplyMatrices(A, B));
                    break;
                case 6:
                    displayMatrix(transposeMatrix(A));
                    break;
                case 7:
                    System.out.print("Enter 2 or 3 for size of matrix: ");
                    int size = sc.nextInt();
                    int[][] detMat = createMatrix(size, size);
                    displayMatrix(detMat);
                    int det = size == 2 ? determinant2x2(detMat) : determinant3x3(detMat);
                    System.out.println("Determinant = " + det);
                    break;
                case 8:
                    int[][] invMat = createMatrix(2, 2);
                    displayMatrix(invMat);
                    double[][] inv = inverse2x2(invMat);
                    if(inv != null) {
                        System.out.println("Inverse:");
                        displayDoubleMatrix(inv);
                    } else {
                        System.out.println("Matrix is singular (no inverse)");
                    }
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
