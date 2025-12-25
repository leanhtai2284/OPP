package lesson3_extend.exercises.bai04;

import java.util.Scanner;

public abstract class Phone {
    private String id;
    private String namePhone;
    private double price;
    private String warrantyPeriod;
    private String manufacturer;

    // Constructor
    public Phone() {
    }

    public Phone(String id, String namePhone, double price, String warrantyPeriod, String manufacturer) {
        this.id = id;
        this.namePhone = namePhone;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
        this.manufacturer = manufacturer;
    }

    // setGet
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // nhap
    public void input(Scanner sc){
        System.out.println("Nhap ten dien thoai: ");
        this.namePhone = sc.nextLine();
        System.out.println("Nhap gia ban: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap thoi gian bao hanh: ");
        this.warrantyPeriod = sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        this.manufacturer = sc.nextLine();
    }

    public void output(){
        System.out.println("Ten dien thoai: " + this.namePhone);
        System.out.println("Gia ban: " + this.price);
        System.out.println("Thoi gian bao hanh: " + this.warrantyPeriod);
        System.out.println("Nha san xuat: " + this.manufacturer);
    }

    public abstract double sumPrice();

}
