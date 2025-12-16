package lesson2_constructor.Practice.animal;

import java.util.Scanner;

public class Animal {

    private int id;
    private String name;
    private String color;
    private int age;

    public Animal(){
        id = 0;
        age = 5;
        name = "Meo";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void input(Scanner sc){
//        System.out.print("Nhap id: ");
//        this.id = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhap ten con vat: ");
//        this.name = sc.nextLine();
//        System.out.print("Nhap mau sac: ");
//        this.color = sc.nextLine();
//        System.out.print("Nhap tuoi: ");
//        this.age = Integer.parseInt(sc.nextLine());
//    }

    public void output(){
        System.out.println("ID: " + getId());
        System.out.println("Ten: " + getName());
        System.out.println("Mau sac: " + getColor());
        System.out.println("Tuoi: " + getAge());
    }


}
