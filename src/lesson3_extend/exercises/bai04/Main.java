package lesson3_extend.exercises.bai04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhoneNew> phoneNews = new ArrayList<>();
    static ArrayList<PhoneOld> phoneOlds = new ArrayList<>();

    static ArrayList<Phone> phones = new ArrayList<>();


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
                System.out.println("6. Tìm kiếm");
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
//                        add();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        break;
                    case 5:
                        sortPrice();
                        break;
                    case 6:
                        search();
                        break;
                    case 7:
                        calculateTotalRevenue();
                        break;
                    case 8:
                        applyDiscountForOldPhones();
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

                switch (choose) {
                    case 1:
                        for (Phone p : phones) {
                            p.output();
                        }
                        break;
                    case 2:
                        for (Phone p : phones) {
                            if (p instanceof PhoneOld) {
                                p.output();
                            }
                        }
                        break;
                    case 3:
                        for (Phone p : phones) {
                            if (p instanceof PhoneNew) {
                                p.output();
                            }
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

//    private static void add(){
//        int choose = 0;
//
//        while (true){
//            do {
//                System.out.println("=== Thêm mới ===");
//                System.out.println("1. Thêm mới điện thoại cũ");
//                System.out.println("2. Thêm mới điện thoại mới");
//                System.out.println("3. Trở về menu chính");
//
//                System.out.println("Mời bạn lựa chọn: ");
//                choose = Integer.parseInt(sc.nextLine());
//
//                switch (choose){
//                    case 1:
//                        PhoneOld po1 = new PhoneOld();
//                        po1.input(sc);
//                        System.out.println("Nhap ID: ");
//                        po1.setId(sc.nextLine());
//                        phoneOlds.add(po1);
//                        break;
//                    case 2:
//                        PhoneNew pn1 = new PhoneNew();
//                        pn1.input(sc);
//                        System.out.println("Nhap ID: ");
//                        pn1.setId(sc.nextLine());
//                        phoneNews.add(pn1);
//                        break;
//                    case 3:
//                        return;
//                    default:
//                        break;
//                }
//            }while (choose < 1 || choose > 3);
//        }
//    }

    private static void update() {
        System.out.println("=== Cap nhap thong tin ===");
        System.out.println("Nhap ID: ");
        String idFind = sc.nextLine();
        boolean find = false;

        for (PhoneOld po : phoneOlds) {
            if (po.getId().equalsIgnoreCase(idFind)) {
                System.out.println("Tìm thấy ID điện thoại cũ" + po.getId());
                System.out.println("Cập nhật thông tin mới: ");
                po.input(sc);
                find = true;
                break;
            }
        }
        if (!find) {
            for (PhoneNew pn : phoneNews) {
                if (pn.getId().equalsIgnoreCase(idFind)) {
                    System.out.println("Tìm thấy ID điện thoại mới" + pn.getId());
                    System.out.println("Cập nhật thông tin mới: ");
                    pn.input(sc);
                    find = true;
                    break;
                }
            }
        }

        if (find) {
            System.out.println("Cập nhật thông tin thành công");
        } else {
            System.out.println("Không tìm thấy ID: " + idFind);
        }
    }
// bai 6:
    private static void sortPrice() {
        phones.add(new PhoneNew("1", "SamSung", 15000, "24", "han", "85", "Dep"));
        phones.add(new PhoneOld("2", "Xiami", 30000, "24", "han", "5"));
        phones.add(new PhoneNew("3", "Iphone", 24000, "24", "han", "85", "Dep likenew"));

        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                    Phone maxPrice = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, maxPrice);
                }
            }
        }
        System.out.println("=== Danh sách sau khi sắp xếp tăng dần theo giá ===");
        for (Phone p : phones){
            p.output();
        }
    }
// bai 7
    private static void search() {
        int choose;
        while (true) {
            do {
                System.out.println("=== TÌM KIẾM ===");
                System.out.println("1. Tìm theo loại");
                System.out.println("2. Tìm theo khoảng giá");
                System.out.println("3. Tìm theo tên");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        searchByType();
                        break;
                    case 2:
                        searchByPriceRange();
                        break;
                    case 3:
                        searchByName();
                        break;
                    case 4:
                        return;
                }
            } while (choose < 1 || choose > 4);
        }
    }
    private static void searchByType() {
        System.out.println("1. Điện thoại cũ");
        System.out.println("2. Điện thoại mới");
        System.out.print("Chọn loại: ");
        int type = Integer.parseInt(sc.nextLine());

        boolean found = false;
        for (Phone p : phones) {
            if (type == 1 && p instanceof PhoneOld) {
                p.output();
                found = true;
            } else if (type == 2 && p instanceof PhoneNew) {
                p.output();
                found = true;
            }
        }

        if (!found) System.out.println("Không tìm thấy kết quả phù hợp!");
    }

    private static void searchByPriceRange() {
        System.out.print("Nhập giá min: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giá max: ");
        int max = Integer.parseInt(sc.nextLine());

        if (min > max) {
            int t = min; min = max; max = t;
        }

        boolean found = false;
        for (Phone p : phones) {
            double price = p.getPrice();
            if (price >= min && price <= max) {
                p.output();
                found = true;
            }
        }

        if (!found) System.out.println("Không tìm thấy điện thoại trong khoảng giá này!");
    }

    private static void searchByName() {
        System.out.print("Nhập tên cần tìm: ");
        String key = sc.nextLine().trim().toLowerCase();

        boolean found = false;
        for (Phone p : phones) {
            String name = p.getNamePhone().toLowerCase();
            if (name.contains(key)) {
                p.output();
                found = true;
            }
        }

        if (!found) System.out.println("Không tìm thấy tên gần đúng: " + key);
    }
    private static void calculateTotalRevenue() {
        double total = 0;
        System.out.println("=== CHI TIẾT GIÁ TRỊ TỒN KHO ===");
        for (Phone p : phones) {
            double currentPrice = p.sumPrice();
            total += currentPrice;
            System.out.printf("- %s: %.2f (Tổng tiền)\n", p.getNamePhone(), currentPrice);
        }
        System.out.println("--------------------------------");
        System.out.println(">>> TỔNG DOANH THU DỰ KIẾN: " + total);
    }

    private static void applyDiscountForOldPhones() {
        System.out.print("Nhập phần trăm muốn giảm giá (VD: 20): ");
        int percent;
        try {
            percent = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu!");
            return;
        }

        boolean found = false;
        for (Phone p : phones) {
            if (p instanceof KhuyenMai) {
                ((KhuyenMai) p).khuyenMai(percent);
                found = true;
            }
        }

        if (found) {
            System.out.println("Đã cập nhật giá xong. Vui lòng xem lại danh sách (Menu 1).");
        } else {
            System.out.println("Không có điện thoại cũ nào để giảm giá.");
        }
    }



}
