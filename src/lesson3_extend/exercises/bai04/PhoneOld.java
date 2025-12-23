package lesson3_extend.exercises.bai04;

import java.util.Scanner;

public class PhoneOld extends Phone {
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
}
