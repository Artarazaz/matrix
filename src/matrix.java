import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int row1 = 0;
        int column1 = 0;
        int[][] matrix1 = new int[0][0];
        //ask for random or manually for first matrix
        System.out.println("How do you want to enter your first Matrix?");
        System.out.println("Enter 1 if you want enter your Matrix manually");
        System.out.println("Enter 2 if you want a random Matrix");
        int z = 0;
        while (z < 1) {
            int p = scanner.nextInt();
            if (p == 1) {
                //enter first matrix manually
                System.out.println("Enter number of rows for first Matrix");
                row1 = scanner.nextInt();
                System.out.println("Enter number of column for first Matrix");
                column1 = scanner.nextInt();
                matrix1 = new int[row1][column1];
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < column1; j++) {
                        System.out.println("Enter yor input for row " + (i + 1) + " and " + " column " + (j + 1));
                        matrix1[i][j] = scanner.nextInt();
                    }
                }
                z = 1;
            } else if (p == 2) {
                //generate first random matrix
                row1 = random.nextInt(1, 20);
                column1 = random.nextInt(1, 20);
                matrix1 = new int[row1][column1];
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < column1; j++) {
                        matrix1[i][j] = random.nextInt(999);
                    }
                }
                z = 1;
            } else {
                //print error if user chose out of range
                System.out.println("You have chosen a wrong number, Please choose 1 or 2");
            }
        }
        int row2 = 0;
        int column2 = 0;
        int[][] matrix2 = new int[0][0];
        //ask for random or manually for second matrix
        System.out.println("How do you want to enter your second Matrix?");
        System.out.println("Enter 1 if you want enter your Matrix manually");
        System.out.println("Enter 2 if you want a random Matrix");
        z = 0;
        while (z < 1) {
            int o = scanner.nextInt();
            if (o == 1) {
                //enter second matrix manually
                System.out.println("Enter number of rows for second Matrix");
                row2 = scanner.nextInt();
                System.out.println("Enter number of column for second Matrix");
                column2 = scanner.nextInt();
                matrix2 = new int[row2][column2];
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        System.out.println("Enter yor input for row " + (i + 1) + " and " + " column " + (j + 1));
                        matrix2[i][j] = scanner.nextInt();
                        z = 1;
                    }
                }
            } else if (o == 2) {
                //generate second random matrix
                row2 = random.nextInt(1, 20);
                column2 = random.nextInt(1, 20);
                matrix2 = new int[row2][column2];
                System.out.println("row2 " + row2 + " col2 " + column2);
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        matrix2[i][j] = random.nextInt(999);
                        z = 1;
                    }
                }
            } else {
                System.out.println("You have chosen a wrong number, Please choose 1 or 2");
            }
        }
        int x;
        int y;
        int sum;
        int minus;
        int panel = 0;
        System.out.println(" ");
        System.out.println("Enter 1 for see the First Matrix");
        System.out.println("Enter 2 for see the Second Matrix");
        System.out.println("Enter 3 for see the Sum of two matrix");
        System.out.println("Enter 4 for see the Matrix one minus Matrix two");
        System.out.println("Enter 5 for see the Matrix two minus Matrix one");
        System.out.println("Enter 6 for see the multiplication of two matrix");
        System.out.println("Enter 7 for see the transpose of the First Matrix");
        System.out.println("Enter 8 for see the transpose of the Second Matrix");
        System.out.println("Enter 9 for Exit");
        System.out.println(" ");
        while (panel < 9) {
            panel = scanner.nextInt();
            switch (panel) {
                case 1 -> {
                    //show first matrix
                    System.out.println("First matrix: ");
                    for (int i = 0; i < row1; i++) {
                        System.out.println(Arrays.toString(matrix1[i]));
                    }
                }
                case 2 -> {
                    //show second matrix
                    System.out.println("Second matrix: ");
                    for (int i = 0; i < row2; i++) {
                        System.out.println(Arrays.toString(matrix2[i]));
                    }
                }
                case 3 -> {
                    //calculate foe sum of the two matrix
                    if (row1 == row2 && column1 == column2) {
                        //check if two matrix have same size of rows and columns
                        int[][] matrixSum = new int[row1][column1];
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < column1; j++) {
                                for (i = 0; i < row2; i++) {
                                    for (j = 0; j < column2; j++) {
                                        y = matrix2[i][j];
                                        x = matrix1[i][j];
                                        sum = x + y;
                                        matrixSum[i][j] = sum;
                                    }
                                }
                            }
                        }
                        System.out.println("Sum of two matrix: ");
                        for (int i = 0; i < row2; i++) {
                            //print sum of two matrix
                            System.out.println(Arrays.toString(matrixSum[i]));
                        }
                    } else {
                        //print error if two matrix does not have same size of rows and columns
                        System.out.println("Sorry, For Matrix sum, both Matrix must have same size of rows and column.");
                    }
                }
                case 4 -> {
                    //calculate for minus of two matrix
                    if (row1 == row2 && column1 == column2) {
                        //check if two matrix have same size of rows and columns
                        int[][] matrixMinus = new int[row1][column1];
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < column1; j++) {
                                for (i = 0; i < row2; i++) {
                                    for (j = 0; j < column2; j++) {
                                        y = matrix2[i][j];
                                        x = matrix1[i][j];
                                        minus = x - y;
                                        matrixMinus[i][j] = minus; //save result in new matrix array
                                    }
                                }

                            }
                        }
                        System.out.println("Minus of two matrix: ");
                        for (int i = 0; i < row2; i++) {
                            //print minus of two matrix
                            System.out.println(Arrays.toString(matrixMinus[i]));
                        }
                    } else {
                        //print error if two matrix does not have the same size of rows and columns
                        System.out.println("Sorry, For Matrix minus, both Matrix must have same size of rows and column.");
                    }
                }
                case 5 -> {
                    if (row1 == row2 && column1 == column2) {
                        int[][] matrixMinus1 = new int[row1][column1];
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < column1; j++) {
                                for (i = 0; i < row2; i++) {
                                    for (j = 0; j < column2; j++) {
                                        y = matrix2[i][j];
                                        x = matrix1[i][j];
                                        minus = y - x;
                                        matrixMinus1[i][j] = minus;
                                    }
                                }

                            }
                        }
                        System.out.println("Minus of two matrix: ");
                        for (int i = 0; i < row2; i++) {
                            //print minus of two matrix
                            System.out.println(Arrays.toString(matrixMinus1[i]));
                        }
                    } else {
                        //print error if two matrix does not have the same size of rows and columns
                        System.out.println("Sorry, For Matrix minus, both Matrix must have same size of rows and column.");
                    }
                }
                case 6 -> {
                    //calculate for multiplication of two matrix
                    if (column1 == row2) {
                        //check if column of first matrix is equal to row of second matrix
                        int[][] product = new int[row1][column2];
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < column2; j++) {
                                for (int k = 0; k < column1; k++) {
                                    product[i][j] += matrix1[i][k] * matrix2[k][j]; //®
                                }
                            }
                        }
                        System.out.println("Multiplication of two matrices: ");
                        for (int i = 0; i < row1; i++) {
                            //print multiplication of two matrix
                            System.out.println(Arrays.toString(product[i]));
                        }
                    } else {
                        //print error if two matrix does not meet the condition
                        System.out.println("Sorry, For Matrix multiplication, the number of columns in the first Matrix must be equal to the number of rows in the second Matrix.");
                    }
                }
                case 7 -> {
                    System.out.println("Transpose of the First Matrices: ");
                    int[][] transpose = new int[column1][row1];
                    for (int j = 0; j < column1; j++) {
                        for (int i = 0; i < row1; i++) {
                            //save transpose of first matrix in new matrix
                            transpose[j][i] = matrix1[i][j];
                        }
                    }
                    for (int j = 0; j < column1; j++) {
                        //print transpose for first matrix
                        System.out.println(Arrays.toString(transpose[j]));
                    }
                }
                case 8 -> {
                    System.out.println("Transpose of the Second Matrices: ");
                    int[][] transpose1 = new int[column2][row2];
                    for (int j = 0; j < column2; j++) {
                        for (int i = 0; i < row2; i++) {
                            //save transpose of second matrix in new matrix
                            transpose1[j][i] = matrix2[i][j];
                        }
                    }
                    for (int j = 0; j < column2; j++) {
                        //print transpose of second matrix
                        System.out.println(Arrays.toString(transpose1[j]));
                    }
                }
            }
        }
        System.out.println("You have Exited of Matrix program");
    }
}