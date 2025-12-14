package lesson1.Exercises.Bai1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten SV: ");
        name = sc.nextLine();

        System.out.print("Nhap diem toan: ");
        mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap diem van: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    public double calculateAverageScore(){
        return (mathScore + literatureScore) / 2;
    }

    public void output(){
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Diem toan: " + mathScore);
        System.out.println("Diem van: " + literatureScore);
        System.out.println("Diem trung binh: " + calculateAverageScore());
    }
}
