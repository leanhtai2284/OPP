package lesson3_extend.exercises.bai04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhoneNew> phoneNews = new ArrayList<>();
    static ArrayList<PhoneOld> phoneOlds = new ArrayList<>();

    public static void main(String[] args) {
        int choose = 0;
        while (true) {
            do {
                System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI =====");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giá");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        list();
                        break;
                    case 2:
                        add();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        return;
                    default:
                        break;
                }
            } while (choose < 1 || choose > 9);
        }
    }

    private static void list() {
        int choose = 0;

        while (true) {
            do {
                System.out.println("=== danh sách điện thoại ===");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose){
                    case 1:
                        for (PhoneNew pn : phoneNews){
                            pn.output();
                            for (PhoneOld po : phoneOlds){
                                po.output();
                            }
                        }
                        break;
                    case 2:
                        for (PhoneOld po : phoneOlds) {
                            po.output();
                        }
                        break;
                    case 3:
                        for (PhoneNew pn : phoneNews){
                            pn.output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        break;
                }
            } while (choose < 1 || choose > 4);
        }
    }

    private static void add(){
        int choose = 0;

        while (true){
            do {
                System.out.println("=== Thêm mới ===");
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thoại mới");
                System.out.println("3. Trở về menu chính");

                System.out.println("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose){
                    case 1:
                        PhoneOld po1 = new PhoneOld();
                        po1.input(sc);
                        System.out.println("Nhap ID: ");
                        po1.setId(sc.nextLine());
                        phoneOlds.add(po1);
                        break;
                    case 2:
                        PhoneNew pn1 = new PhoneNew();
                        pn1.input(sc);
                        System.out.println("Nhap ID: ");
                        pn1.setId(sc.nextLine());
                        phoneNews.add(pn1);
                        break;
                    case 3:
                        return;
                    default:
                        break;
                }
            }while (choose < 1 || choose > 3);
        }
    }

    private static void update(){
        System.out.println("=== Cap nhap thong tin ===");
        System.out.println("Nhap ID: ");
        String idFind = sc.nextLine();
        boolean find = false;

        for (PhoneOld po : phoneOlds){
            if (po.getId().equalsIgnoreCase(idFind)){
                System.out.println("Tìm thấy ID điện thoại cũ" + po.getId());
                System.out.println("Cập nhật thông tin mới: ");
                po.input(sc);
                find = true;
                break;
            }
        }
        if (!find){
            for (PhoneNew pn : phoneNews){
                if (pn.getId().equalsIgnoreCase(idFind)){
                    System.out.println("Tìm thấy ID điện thoại mới" + pn.getId());
                    System.out.println("Cập nhật thông tin mới: ");
                    pn.input(sc);
                    find = true;
                    break;
                }
            }
        }

        if (find){
            System.out.println("Cập nhật thông tin thành công");
        }else {
            System.out.println("Không tìm thấy ID: " + idFind);
        }


    }

}
