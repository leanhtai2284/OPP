package lesson1.Exercises.Bai3;

import java.util.Scanner;

public class Point {
    double X;
    double Y;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do X: ");
        X = sc.nextDouble();

        System.out.print("Nhap toa do Y: ");
        Y = sc.nextDouble();
    }

    public double distanceTo(Point other){
        return Math.sqrt(Math.pow(other.X-this.X,2) + Math.pow(other.Y-this.Y,2));
    }

}
