package lesson3_extend.practice.eployee;

import java.util.Scanner;

public class ManagementEmployee extends Emplyee {
    private double basicSalary;
    private double coefficientSalary;

    // constructor
    public ManagementEmployee() {
    }

    public ManagementEmployee(String id, String fullName, String dayOfBirth, String address, double basicSalary, double coefficientSalary) {
        super(id, fullName, dayOfBirth, address);
        this.basicSalary = basicSalary;
        this.coefficientSalary = coefficientSalary;
    }


    // dam bao tinh bao dong
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    //input
    @Override
    public void input(Scanner sc){
        super.input(sc);

        System.out.print("Nhap luong co ban: ");
        this.basicSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap he so luong: ");
        this.coefficientSalary = Double.parseDouble(sc.nextLine());
    }
    //output
    @Override
    public void output(){
        super.output();

        System.out.println("Tien luong: " + this.basicSalary);
        System.out.println("He so luong: " + this.coefficientSalary);
    }



}
