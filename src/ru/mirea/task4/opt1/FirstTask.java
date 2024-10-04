package ru.mirea.task4.opt1;
import java.util.Scanner;
enum Season {
    WINTER(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше любимое время года (WINTER, SPRING, SUMMER, AUTUMN):");
        String userInput = scanner.nextLine().toUpperCase();

        Season favoriteSeason;
        try {
            favoriteSeason = Season.valueOf(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный ввод. Пожалуйста, введите одно из следующих времен года: WINTER, SPRING, SUMMER, AUTUMN.");
            return;
        }

        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        printSeasonMessage(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
        }

        scanner.close();
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я не люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
