package lesson1.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Student s1 = new Student();
//        Student s2 = new Student();

//        System.out.println("Nhap thong SV1");
//        s1.input(sc);
//        System.out.println("Nhap thong SV2");
//        s2.input(sc);
//
//        System.out.println("Thong tin SV1");
//        s1.output();
//        System.out.println("Thong tin SV2");
//        s2.output();

        ArrayList<Student> students = new ArrayList<>();
        int n;
        do{
            System.out.println("==== So luong sinh vien ====");
            System.out.print("Nhap so luong sinh vien: ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0){
                System.out.println("So luong SV lon > 0");
            }
        }while (n <= 0);

        Student student;
        for (int i = 0; i < n; i++){
            System.out.println("\nNhap thong tin SV thu " + (i+1));
            student = new Student();
            student.input(sc);
            students.add(student);
        }

        for (int i = 0; i < n; i++){
            System.out.println("\nThong tin SV thu " + (i+1));
            students.get(i).output();
        }

    }

}
