package ru.mirea.task2.opt3;


class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}


class Circle {
    private Point center;
    private double radius;


    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }


    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle(center=" + center + ", radius=" + radius + ")";
    }
}

class Tester {
    private Circle[] circles;
    private int count;


    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }


    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей полон!");
        }
    }


    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}
public class SecTask {
    public static void main(String[] args) {
        Tester tester = new Tester(5);


        Point p1 = new Point(1, 2);
        Circle c1 = new Circle(p1, 3.5);
        tester.addCircle(c1);

        Point p2 = new Point(4, 5);
        Circle c2 = new Circle(p2, 2.0);
        tester.addCircle(c2);

        Point p3 = new Point(0, 0);
        Circle c3 = new Circle(p3, 1.0);
        tester.addCircle(c3);


        tester.displayCircles();
    }
}
