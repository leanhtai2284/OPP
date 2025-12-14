package lesson1.Exercises.Bai2;

import java.util.OptionalInt;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();


        System.out.println("==== Phan So ====");
        System.out.println("Nhap vao phan so 1");
        ps1.input();
        System.out.println("Nhap vao phan so 2");
        ps2.input();
        ps1.kiemTraPhanSo();
        ps2.kiemTraPhanSo();


        // Tong
        PhanSo tong = ps1.cong(ps2);
        System.out.println("Tong: ");
        tong.output();
        // Hieu
        PhanSo hieu = ps1.tru(ps2);
        System.out.println("Hieu: ");
        hieu.output();
        // Tich
        PhanSo tich = ps1.tich(ps2);
        System.out.println("Tich: ");
        tich.output();
        // Thuong
        PhanSo thuong = ps1.thuong(ps2);
        System.out.println("Thuong: ");
        thuong.output();



    }
}
