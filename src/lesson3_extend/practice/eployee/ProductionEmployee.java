package lesson3_extend.practice.eployee;

import java.util.Scanner;

public class ProductionEmployee extends Emplyee {
    private double numberProducts;


    // constructor
    public ProductionEmployee(){}

    public ProductionEmployee(String id, String fullName, String dayOfBirth, String address, double numberProducts) {
        super(id, fullName, dayOfBirth, address);
        this.numberProducts = numberProducts;
    }

    public double getNumberProducts() {
        return numberProducts;
    }

    public void setNumberProducts(double numberProducts) {
        this.numberProducts = numberProducts;
    }

    @Override
    public void input(Scanner sc){
        super.input(sc);

        /// rieng
        System.out.print("Nhap so san pham: ");
        this.numberProducts = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void output(){
        super.output();

        System.out.println("So san pham: " + this.numberProducts);

    }
}

