package ru.mirea.task1.opt4;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите количество элементов в массиве: ");
    int n = scanner.nextInt();

    int[] array = new int[n];

    int i = 0;
    while (i < n) {
        System.out.print("Введите элемент " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
        i++;
    }

    int sum = 0;
    int max = array[0];
    int min = array[0];

    int j = 0;
    do {
        sum += array[j];
        if (array[j] > max) {
            max = array[j];
        }
        if (array[j] < min) {
            min = array[j];
        }
        j++;
    } while (j < n);

    System.out.println("Сумма элементов массива: " + sum);
    System.out.println("Максимальный элемент массива: " + max);
    System.out.println("Минимальный элемент массива: " + min);

    scanner.close();
}
}
