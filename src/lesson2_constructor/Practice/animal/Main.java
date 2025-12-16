package lesson2_constructor.Practice.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Animal a1 = new Animal();
        System.out.println("=== Animal ===");

        a1.setId(1);
        a1.getAge();
        a1.output();


    }
}
