package ru.mirea.task6.opt1;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        point.moveUp();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 10);
        circle.moveRight();
        System.out.println(circle);
    }
}
