package ru.mirea.task3.opt1;
import java.util.Arrays;
import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {

        int size = 10;
        double[] array = new double[size];


        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100; // Случайные числа от 0 до 100
        }


        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(array));


        Arrays.sort(array);


        System.out.println("Отсортированный массив: " + Arrays.toString(array));


        Random random = new Random();
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
        }


        System.out.println("Массив с использованием класса Random: " + Arrays.toString(array2));


        Arrays.sort(array2);


        System.out.println("Отсортированный второй массив: " + Arrays.toString(array2));
    }
}
