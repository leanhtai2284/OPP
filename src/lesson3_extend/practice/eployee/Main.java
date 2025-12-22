package lesson3_extend.practice.eployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<ManagementEmployee> empQList = new ArrayList<>();

    static ArrayList<ProductionEmployee> empSXList = new ArrayList<>();


    public static void main(String[] args) {
        int choose;

        while (true) {
            do {
                System.out.println("==== Chuong trinh nhan vien ====");
                System.out.println("1. Them moi");
                System.out.println("2. Cap nhap thong tin");
                System.out.println("3. Xem danh sach");
                System.out.println("4. Thoat");

                System.out.println("Moi ban lua chon: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        menuAdd();
                        break;
                    case 2:
                        updateEmp();
                        break;
                    case 3:
                        listEmp();
                        break;
                    case 4:
                        return;
                    default:
                        break;
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void menuAdd(){
        int choose;

        while (true) {
            do {
                System.out.println("==== Them moi nhan vien ====");
                System.out.println("1. Nhan vien quan ly");
                System.out.println("2. Nhan vien san xuat");
                System.out.println("3. Tro ve menu chinh");

                System.out.println("Moi ban lua chon: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        ManagementEmployee empQL1 = new ManagementEmployee();
                        empQL1.input(sc);
                        System.out.print("Nhap id: ");
                        empQL1.setId(sc.nextLine());
                        empQList.add(empQL1);
                        break;
                    case 2:
                        ProductionEmployee empNX1 = new ProductionEmployee();
                        empNX1.input(sc);
                        System.out.print("Nhap id: ");
                        empNX1.setId(sc.nextLine());
                        empSXList.add(empNX1);
                        break;
                    case 3:
                        return;
                    default:
                        break;
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static void updateEmp() {
        System.out.println("=== Cap nhap thong tin ===");
        System.out.println("Nhap ID: ");
        String idFind = sc.nextLine();
        boolean find = false;


        for (ManagementEmployee emp : empQList){
            if (emp.getId().equalsIgnoreCase(idFind)){
               System.out.println("Tim thay nhan vien quan ly: " + emp.getId());
                System.out.println("Nhap thong tin moi: ");
                emp.input(sc);
                find = true;
                break;
            }

        }
        if (!find){
            for (ProductionEmployee emp1 : empSXList){
                if (emp1.getId().equalsIgnoreCase(idFind)){
                    System.out.println("Tim thay nhan vien san xuat: " + emp1.getId());
                    System.out.println("Nhap thong tin moi: ");
                    emp1.input(sc);
                    find = true;
                    break;
                }
            }
        }

        if (find){
            System.out.println("Cap nhap thong tin thanh cong");
        }else {
            System.out.println("Khong tim thay ID: " + idFind);
        }
    }

    private static void listEmp(){
        int choose;

        while (true){
            do {
                System.out.println("=== Danh sach thong tin nhan vien ===");
                System.out.println("1. Nhan vien quan ly");
                System.out.println("2. Nhan vien san xuat");
                System.out.println("3. Tat ca nhan vien");
                System.out.println("4. Tro ve menu chinh");

                System.out.print("Moi ban chon: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose){
                    case 1:
                        for (ManagementEmployee emp : empQList){
                            emp.output();
                        }
                        break;
                    case 2:
                        for (ProductionEmployee emp1 : empSXList){
                            emp1.output();
                        }
                       break;
                    case 3:
                        for (ManagementEmployee emp : empQList){
                            emp.output();
                            for (ProductionEmployee emp1 : empSXList){
                                emp1.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                }
            }while (choose < 1 || choose > 4);
        }
    }



}
