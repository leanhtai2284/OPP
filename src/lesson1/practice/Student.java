package lesson1.practice;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    String hobby;

    public void run(){
        System.out.println(name + " chay nhanh");
    }

    public void input(Scanner sc){
        System.out.print("Nhap ten sinh vien: ");
        name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so thich: ");
        hobby = sc.nextLine();
    }
    public void output(){
        System.out.println("Ten sv: " + name);
        System.out.println("Tuoi sv: " + age);
        System.out.println("So thich sv: " + hobby);
    }

}
