package lesson3_extend.exercises.bai04;

import java.util.Scanner;

public class PhoneNew extends Phone{
    private String batteryStatus;
    private String additionalDescription;

    // Constructor
//    public PhoneNew() {
//    }

    public PhoneNew(String id, String namePhone, double price, String warrantyPeriod, String manufacturer, String batteryStatus, String additionalDescription) {
        super(id, namePhone, price, warrantyPeriod, manufacturer);
        this.batteryStatus = batteryStatus;
        this.additionalDescription = additionalDescription;
    }

    //getset


    public String getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(String batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }

    //nhap
    @Override
    public void input(Scanner sc){
        super.input(sc);

        System.out.println("Nhap tinh trang pin: ");
        this.batteryStatus = sc.nextLine();
        System.out.println("Nhap phan mo ta them: ");
        this.additionalDescription = sc.nextLine();
    }
    //xuat
    @Override
    public void output(){
        super.output();

        System.out.println("Tinh trang pin: " + this.batteryStatus);
        System.out.println("Mo ta them: " + this.additionalDescription);
    }
    // bai 7
    @Override
    public double sumPrice() {
        return this.getPrice();
    }
}
