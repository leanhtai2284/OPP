package lesson1.Exercises.Bai3;

import java.util.Scanner;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point();


        System.out.println("Nhap diem 1");
        p1.input();
        System.out.println("Nhap diem 2");
        p2.input();

        double distance = p1.distanceTo(p2);


//        int distance = point1.distanceTo(point2);
        System.out.println("Khoang cach cua toa do X Y: " + distance);
    }
}
