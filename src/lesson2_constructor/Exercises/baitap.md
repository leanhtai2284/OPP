leanhtai
leanhtai2284
Trực tuyến

Đây là sự khởi đầu của kênh #exercises.
thienhh — 21/11/2025 11:40 SA
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập vào tháng và năm từ bàn phím
        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        // Bước 2: Xác định số ngày trong tháng
        int daysInMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                // Năm nhuận: Chia hết cho 4 nhưng không chia hết cho 100, hoặc năm chia hết cho 400
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Năm không nhuận
                }
                break;
            default:
                daysInMonth = 31;
                break;
        }

        // Bước 3: In ra màn hình console số ngày trong tháng
        System.out.printf("Số ngày trong tháng %d năm %d là %d ngày.", month, year, daysInMonth);
    }
thienhh — 21/11/2025 10:23 CH
A gửi bài tập buổi 3
# Bài tập 1: Kiểm tra số chính phương

## Đề bài:
> Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
> * Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên. vd: 0, 1, 4, 9, 16, 25, 36 ...
    Mở rộng
    homework_lesson03.md
    3 KB
    kyokokanata — 23/11/2025 1:33 CH
    https://github.com/NguyenThanhNhan-7068/hoc_backend_techzen
    GitHub
    GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
    Contribute to NguyenThanhNhan-7068/hoc_backend_techzen development by creating an account on GitHub.
    GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
    thienhh — 23/11/2025 2:16 CH
    Ok e
    Winz — 24/11/2025 12:00 SA
    https://github.com/VoDangNam/Java_Backend_Techzen/blob/main/src/Bai02.java
    GitHub
    Java_Backend_Techzen/src/Bai02.java at main · VoDangNam/Java_Backe...
    Contribute to VoDangNam/Java_Backend_Techzen development by creating an account on GitHub.
    thienhh — 24/11/2025 6:12 SA
    Ok e
    thienhh — 24/11/2025 4:10 CH
# Bài tập 1: In dãy số lẻ từ 1 đến n

> **Đề bài:**
> In dãy số 1, 3, 5, 7, 9, ... n (n là số nhập vào từ bàn phím)

### Hướng dẫn các bước thực hiện
Mở rộng
exercises.md
10 KB
thienhh — 26/11/2025 2:42 CH
Bài tập bài 5: Method
# Bài tập 1: Câu lệnh điều kiện và rẽ nhánh

> **Đề bài:**
> Bài tập chương câu lệnh điều kiện và rẽ nhánh: <br>
> a. Viết phương thức đổi một ký tự hoa sang ký tự thường <br>
> b. Viết phương thức giải phương trình bậc nhất <br>
Mở rộng
exercises05.md
11 KB
thienhh — 28/11/2025 4:02 CH
Bài tập buổi 6: Chuỗi trong Java
# Bài tập 1: Xử lý chuỗi trong Java

> **Đề bài:**
> Cho chuỗi `String str = "Hello World"` <br>
> a. Lấy ra chữ World <br>
> b. Thay o thành f <br>
Mở rộng
exercises06.md
10 KB
thienhh — 01/12/2025 3:59 CH
Bài tập buổi 7: Mảng một chiều - #01
# Bài tập 1: Mảng một chiều và các thao tác trên mảng

> **Đề bài:**
> Hãy viết một chương trình Java thực hiện các chức năng sau liên quan đến mảng một chiều: <br>
> 1. Các thao tác nhập xuất
     >    * a. Nhập mảng
            Mở rộng
            exercises07.md
            9 KB
            thienhh — 03/12/2025 3:48 CH
            Bài tập buổi 8: Mảng một chiều - #02
# Bài tập 1: Các thao tác xử lý mảng 1 chiều

> **Đề bài:**
> Hãy viết một chương trình Java thực hiện các thao tác xử lý sau liên quan đến mảng một chiều:
>* a. Tách các số nguyên tố có trong mảng a đưa vào mảng b
>* b. Tách mảng a thành 2 mảng b (chứa các số nguyên dương) và c (chứa các số còn lại)
   Mở rộng
   exercises08.md
   6 KB
   thienhh — 08/12/2025 5:13 CH
   Bài tập buổi 9: Mảng 2 chiều & ArrayList
# Bài tập 1: Các thao tác xử lý mảng 1 chiều

> **Đề bài:**
> Viết chương trình thực hiện công việc sau:
>* a. Nhập/Xuất ma trận vuông A (n dòng, n cột) gồm các phần tử kiểu int
>* b. Tính tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận
   Mở rộng
   exercises09.md
   7 KB
   thienhh — 12/12/2025 10:01 SA
   Bài tập buổi 11: OOP
# Bài tập 1: Quản lý thông tin học sinh

## Đề bài

> Viết chương trình cho phép nhập thông tin học sinh, bao gồm:
> * Các thuộc tính: tên học sinh, điểm toán, và điểm văn
    Mở rộng
    exercises01.md
    5 KB
    thienhh — 15/12/2025 1:47 CH
    Sheet tracking điểm lớp Java Backend 04
    https://1drv.ms/x/c/bfca24873e8adce2/IQB-zAplVAStQZZraL7buuZVAQrNGCr4Z-_2y2w7UWmu8XQ?e=cCZJab
    thienhh — 15/12/2025 2:55 CH
    Bài tập 1 (Constructor)
    Hình ảnh
    Hình ảnh
    Nhuw — 15/12/2025 3:48 CH
    Bài tập về nhà buổi 12: Contructors, Access modifier, Encapsulation
# Bài 1: Xây dựng và sử dụng các contructors của lớp Phân Số

> **Đề bài:**
> Tạo lớp **PhanSo** có các constructor và phương thức xử lý để đáp ứng đoạn mã chạy thử bên dưới.
>
>   * **Thuộc tính:** `tuSo`, `mauSo`
      Mở rộng
      ss2_exercises.md
      4 KB
      thienhh — 15/12/2025 8:15 CH
      @everyone Mọi người làm bài tập xong thì nhắn vào đây để @Nhuw review code nhé
      ko nhắn riêng cho a nữa
      Nhuw — Hôm qua lúc 5:04 CH
      @everyone mọi người nộp bài tập trong hôm nay nha
      leanhtai — Hôm qua lúc 6:48 CH
      https://github.com/leanhtai2284/OPP/tree/Lesson2
      GitHub
      GitHub - leanhtai2284/OPP at Lesson2
      Contribute to leanhtai2284/OPP development by creating an account on GitHub.
      Contribute to leanhtai2284/OPP development by creating an account on GitHub.
      𝕻𝖍𝖎 — Hôm qua lúc 11:31 CH
      https://github.com/ngnhphj/TechZen_Java_Exercise_OOP.git
      GitHub
      GitHub - ngnhphj/TechZen_Java_Exercise_OOP
      Contribute to ngnhphj/TechZen_Java_Exercise_OOP development by creating an account on GitHub.
      Contribute to ngnhphj/TechZen_Java_Exercise_OOP development by creating an account on GitHub.
      Winz — Hôm qua lúc 11:54 CH
      https://github.com/VoDangNam/Java_OOP_TECHZENACDM/tree/Bai02/JavaOOP/src/lession02_contructor_static/exercises
      GitHub
      Java_OOP_TECHZENACDM/JavaOOP/src/lession02_contructor_static/exerci...
      Contribute to VoDangNam/Java_OOP_TECHZENACDM development by creating an account on GitHub.
      Contribute to VoDangNam/Java_OOP_TECHZENACDM development by creating an account on GitHub.
      e gửi bt ạ
      kyokokanata — 1:48 CH
      https://github.com/NguyenThanhNhan-7068/hoc_backend_techzen/tree/main
      GitHub
      GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
      Contribute to NguyenThanhNhan-7068/hoc_backend_techzen development by creating an account on GitHub.
      GitHub - NguyenThanhNhan-7068/hoc_backend_techzen
      ﻿
# Bài 1: Xây dựng và sử dụng các contructors của lớp Phân Số

> **Đề bài:**
> Tạo lớp **PhanSo** có các constructor và phương thức xử lý để đáp ứng đoạn mã chạy thử bên dưới.
>
>   * **Thuộc tính:** `tuSo`, `mauSo`
>   * **Yêu cầu Constructors:**
      >       * Mặc định: `0/1`
>       * 1 tham số (chỉ tử số): `tuSo/1`
>       * 2 tham số: `tuSo/mauSo`
>   * **Các phương thức:**
      >       * `xuat()`: In phân số ra màn hình.
>       * `copy()`: Trả về bản sao của đối tượng hiện tại.
>       * `cong(int value)`: Cộng số nguyên vào tử số.

**Đoạn mã chạy thử (Test case):**

```java
public static void main(String[] args) {
    PhanSo a = new PhanSo();
    a.xuat();                       // 0

    PhanSo b = new PhanSo(1, 2);
    b.xuat();                       // 1/2

    PhanSo c = new PhanSo(3);
    c.xuat();                       // 3

    PhanSo d = new PhanSo(-6, -2);
    d.xuat();                       // 3

    PhanSo e = new PhanSo(3, -1);
    e.xuat();                       // -3

    PhanSo f = e.copy();
    f.cong(100);
    e.xuat();                       // -3
    f.xuat();                       // 97
}
```

-----

# Bài 2: Xây dựng và sử dụng các contructors của lớp Thời Gian

> **Đề bài:**
> Tạo lớp **ThoiGian** với các thuộc tính `gio`, `phut`, `giay` và các constructor để xử lý khởi tạo giờ.
>
>   * **Yêu cầu Constructors:**
      >       * Mặc định: `00:00:00`
>       * 1 tham số: `gio` (phút, giây mặc định 0)
>       * 2 tham số: `gio`, `phut` (giây mặc định 0)
>       * 3 tham số: `gio`, `phut`, `giay`
>       * Constructor sao chép: Khởi tạo từ một đối tượng `ThoiGian` khác.
>   * **Phương thức:**
      >       * `xuat()`: Xuất thời gian theo định dạng `HH:MM:SS` (VD: 07:05:01)

**Đoạn mã chạy thử (Test case):**

```java
public static void main(String[] args) {
    ThoiGian a = new ThoiGian();
    a.xuat();                       // 00:00:00

    ThoiGian b = new ThoiGian(7);
    b.xuat();                       // 07:00:00

    ThoiGian c = new ThoiGian(7, 30);
    c.xuat();                       // 07:30:00

    ThoiGian d = new ThoiGian(7, 30, 50);
    d.xuat();                       // 07:30:50

    ThoiGian f = new ThoiGian(d);
    f.xuat();                       // 07:30:50
}
```

-----

# Bài 3: Xây dựng lớp Student với tính bao đóng

> **Đề bài:**
> Xây dựng lớp **Student** quản lý thông tin học sinh thỏa mãn tính bao đóng (Encapsulation).
>
>   * **Thuộc tính (private):**
      >       * `id`: Mã học sinh
>       * `name`: Tên học sinh
>       * `score`: Điểm số
>   * **Yêu cầu nghiệp vụ (Business Logic):**
      >       * **id:** Chỉ được xem (Getter), không được phép chỉnh sửa sau khi khởi tạo (Không có Setter).
>       * **name:** Bắt buộc nhập. Setter phải kiểm tra nếu rỗng thì báo lỗi.
>       * **score:** Phải nằm trong khoảng `0 - 10`. Setter phải kiểm tra điều kiện, nếu sai báo lỗi và không cập nhật.

**Hướng dẫn thực hiện:**

1.  **Khởi tạo:**
    * Khai báo 3 thuộc tính `private`.
    * Tạo Constructor để khởi tạo giá trị ban đầu.
2.  **Getter/Setter:**
    * `getId()`: Chỉ có getter.
    * `setName(String name)`: Kiểm tra `name` có rỗng không trước khi gán.
    * `setScore(double score)`: Kiểm tra `score >= 0 && score <= 10`.
3.  **Kiểm thử:**
    * Tạo đối tượng Student và cố tình gán dữ liệu sai (điểm âm, tên rỗng) để kiểm tra logic validation.