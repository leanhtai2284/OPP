package lesson3_extend.exercises.bai04;

import java.util.Scanner;

public class PhoneOld extends Phone implements KhuyenMai {
    private String quantity;

    //constructor

//    public PhoneOld() {
//    }

    public PhoneOld(String id, String namePhone, double price, String warrantyPeriod, String manufacturer, String quantity) {
        super(id, namePhone, price, warrantyPeriod, manufacturer);
        this.quantity = quantity;
    }

    //bao dong
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    //nhap
    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap so luong: ");
        this.quantity = sc.nextLine();
    }
    //xuat
    @Override
    public void output(){
        super.output();
        System.out.println("So luong: " + this.quantity);
    }

    // bai 7
    @Override
    public double sumPrice() {
        try {
            int qty = Integer.parseInt(this.quantity);
            return this.getPrice() * qty;
        } catch (NumberFormatException e) {
            return this.getPrice();
        }
    }
    //bai 8
    @Override
    public void khuyenMai(int percent) {
        double newPrice = this.getPrice() * (1 - (double)percent / 100);
        this.setPrice(newPrice);
        System.out.println("Da giam gia " + percent + "% cho dien thoai cu: " + this.getNamePhone());
    }
}
