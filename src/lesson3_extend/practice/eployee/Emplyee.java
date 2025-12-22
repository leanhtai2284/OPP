package lesson3_extend.practice.eployee;

import java.util.Scanner;

public class Emplyee {

    private String id;
    private String fullName;
    private String dayOfBirth;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Constructor
    public Emplyee(){}

    public Emplyee(String id, String fullName, String dayOfBirth, String address) {
        this.id = id;
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
    }

    //PT nhap
    public void input(Scanner sc){
        System.out.print("Nhap ten: ");
        this.fullName = sc.nextLine();

        System.out.print("Nhap ngay sinh: ");
        this.dayOfBirth = sc.nextLine();

        System.out.print("Nhap dia chi: ");
        this.address = sc.nextLine();
    }

    public void output(){
        System.out.println("Ma: " + this.id);
        System.out.println("Ho va ten: " + this.fullName);
        System.out.println("Ngay sinh: " + this.dayOfBirth);
        System.out.println("Dia chi: " + this.address);
    }
}
