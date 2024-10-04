package ru.mirea.task4.task41.opt4;
import java.util.Scanner;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public void fillMatrix(double[][] values) {
        if (values.length != rows || values[0].length != cols) {
            throw new IllegalArgumentException("Размеры массива не совпадают с размерами матрицы.");
        }
        this.data = values;
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }


    public Matrix multiplyByScalar(double scalar) {
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }


    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно совпадать с количеством строк второй матрицы.");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк и столбцов для первой матрицы через пробел:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        Matrix matrix1 = new Matrix(rows1, cols1);
        double[][] values1 = new double[rows1][cols1];
        System.out.println("Введите элементы первой матрицы через пробел:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                values1[i][j] = scanner.nextDouble();
            }
        }
        matrix1.fillMatrix(values1);

        System.out.println("Введите количество строк и столбцов для второй матрицы через пробел:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        Matrix matrix2 = new Matrix(rows2, cols2);
        double[][] values2 = new double[rows2][cols2];
        System.out.println("Введите элементы второй матрицы через пробел:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                values2[i][j] = scanner.nextDouble();
            }
        }
        matrix2.fillMatrix(values2);

        if (rows1 == rows2 && cols1 == cols2) {
            Matrix sumMatrix = matrix1.add(matrix2);
            System.out.println("Сумма матриц:");
            sumMatrix.printMatrix();
        } else {
            System.out.println("Матрицы имеют разные размеры и не могут быть сложены.");
        }

        System.out.println("Введите число для умножения первой матрицы:");
        double scalar = scanner.nextDouble();
        Matrix scalarMatrix = matrix1.multiplyByScalar(scalar);
        System.out.println("Первая матрица, умноженная на " + scalar + ":");
        scalarMatrix.printMatrix();

        if (cols1 == rows2) {
            Matrix productMatrix = matrix1.multiply(matrix2);
            System.out.println("Произведение матриц:");
            productMatrix.printMatrix();
        } else {
            System.out.println("Матрицы не могут быть перемножены.");
        }

        scanner.close();
    }
}
