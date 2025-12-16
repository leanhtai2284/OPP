package lesson2_constructor.Exercises.bai1_phanso;

public class PhanSo1 {
    private int tuSo;
    private int mauSo;

    public PhanSo1() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo1(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutgon();
    }

    public PhanSo1(int tuSo) {
        this.tuSo = tuSo;
        this.mauSo = 1;
    }



    public void output() {
        if (this.mauSo == 1) {
            System.out.println(this.tuSo);
        } else {
            System.out.println(this.tuSo + "/" + this.mauSo);
        }
    }

    public PhanSo1 copy() {
        return new PhanSo1(this.tuSo, this.mauSo);
    }

    public void cong(int value){
        this.tuSo += value * this.mauSo;

    }
    private int UCLN(int a, int b) {
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

    private void rutgon() {
        int ucln = UCLN(this.tuSo, this.mauSo);

        tuSo = this.tuSo / ucln;
        mauSo = this.mauSo / ucln;

        if (mauSo < 0) {
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }



}
