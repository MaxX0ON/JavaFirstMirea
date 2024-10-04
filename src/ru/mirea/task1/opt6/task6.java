package ru.mirea.task1.opt6;

public class task6 {
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("Первые %d чисел гармонического ряда:%n", n);

        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("H(%d) = %.6f%n", i, harmonicNumber);
        }
    }
}