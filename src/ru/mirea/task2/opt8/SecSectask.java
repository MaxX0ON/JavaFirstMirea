package ru.mirea.task2.opt8;

public class SecSectask {
    public static void main(String[] args) {

        String[] array = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        System.out.println("Исходный массив:");
        printArray(array);


        reverseArray(array);

        System.out.println("Массив в обратном порядке:");
        printArray(array);
    }


    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }


    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
