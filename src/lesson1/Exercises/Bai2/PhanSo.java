package lesson1.Exercises.Bai2;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        this.tuSo = sc.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            this.mauSo = sc.nextInt();
            if (this.mauSo == 0) {
                System.out.println("Nhap lai mau so - mau so khong duoc = 0!");
            }
        } while (this.mauSo == 0);
    }

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void rutgon() {
        int ucln = UCLN(this.tuSo, this.mauSo);

        tuSo = this.tuSo / ucln;
        mauSo = this.mauSo / ucln;

        if (mauSo < 0) {
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }


    public void output() {
        this.rutgon();

        if (this.mauSo == 1) {
            System.out.println(this.tuSo);
        } else {
            System.out.println(this.tuSo + "/" + this.mauSo);
        }
    }

    public PhanSo cong(PhanSo psKhac) {
        int tuSo = (this.tuSo * psKhac.mauSo) + (psKhac.tuSo * this.mauSo);
        int mauSo = this.mauSo * psKhac.mauSo;
        PhanSo ketQua = new PhanSo(tuSo, mauSo);
        ketQua.rutgon();
        return ketQua;

    }

    public PhanSo tru(PhanSo psKhac) {
        int tuSo = (this.tuSo * psKhac.mauSo) - (psKhac.tuSo * this.mauSo);
        int mauSo = this.mauSo * psKhac.mauSo;
        PhanSo ketQua = new PhanSo(tuSo, mauSo);
        ketQua.rutgon();
        return ketQua;
    }

    public PhanSo tich(PhanSo psKhac) {
        int tuSo = this.tuSo * psKhac.tuSo;
        int mauSo = this.mauSo * psKhac.mauSo;
        PhanSo ketQua = new PhanSo(tuSo, mauSo);
        ketQua.rutgon();
        return ketQua;
    }

    public PhanSo thuong(PhanSo psKhac) {
        int tuSo = this.tuSo * psKhac.mauSo;
        int mauSo = this.mauSo * psKhac.tuSo;
        PhanSo ketQua = new PhanSo(tuSo, mauSo);
        ketQua.rutgon();
        return ketQua;
    }

    public void kiemTraPhanSo() {
        if (tuSo == 0) {
            System.out.println("Phan so bang 0");
        } else if (this.tuSo > 0) {
            System.out.println("Phan so la duong");
        } else {
            System.out.println("Phan so la am");
        }
    }

}

