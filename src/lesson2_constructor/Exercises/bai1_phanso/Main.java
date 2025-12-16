package lesson2_constructor.Exercises.bai1_phanso;

public class Main {
    public static void main(String[] args) {
        PhanSo1 a = new PhanSo1();
        a.output();
        PhanSo1 b = new PhanSo1(1,2);
        b.output();
        PhanSo1 c = new PhanSo1(3);
        c.output();
        PhanSo1 d = new PhanSo1(-6,-2);
        d.output();
        PhanSo1 e = new PhanSo1(3,-1);
        e.output();

        PhanSo1 f = e.copy();
        f.cong(100);
        e.output();
        f.output();
    }
}
