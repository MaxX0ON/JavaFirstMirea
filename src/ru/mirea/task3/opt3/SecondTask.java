package ru.mirea.task3.opt3;
import java.util.Random;

public class SecondTask {
    public static void main(String[] args) {

        int size = 4;
        int[] array = new int[size];
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(90) + 10; // Случайные числа от 10 до 99
        }

        System.out.print("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
