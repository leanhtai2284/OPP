# Bài 1: Đếm số lượng đối tượng Student được tạo ra

## Đề bài

> Viết một lớp `Student` đại diện cho sinh viên, bao gồm các thông tin sau:
> * Mã số sinh viên
> * Tên
> * Điểm
>
>
> Sử dụng biến tĩnh (`static`) để đếm số lượng sinh viên đã được tạo ra và viết phương thức tĩnh để truy xuất số lượng sinh viên.

## Mục tiêu

* Hiểu rõ về biến tĩnh và phương thức tĩnh trong Java.
* Biết cách sử dụng biến tĩnh để lưu trữ thông tin chung cho tất cả các đối tượng của lớp.
* Biết cách sử dụng phương thức tĩnh để truy cập thông tin tĩnh.

## Hướng dẫn các bước thực hiện

### Xây dựng lớp Student

* Khai báo các trường **id**, **name**, **score** để lưu trữ thông tin cá nhân của sinh viên.
* Khai báo biến tĩnh **studentCount** để theo dõi số lượng sinh viên đã được tạo.

### Tạo Constructor

* Trong constructor, khởi tạo thông tin sinh viên và tăng giá trị của **studentCount** lên 1 mỗi khi một đối tượng mới được tạo.

### Thực hiện các phương thức Getter và Setter

* Viết các phương thức getter và setter cho các trường **id**, **name**, **score**.

### Viết phương thức tĩnh truy xuất số lượng sinh viên

* Tạo một phương thức tĩnh (`static method`) để trả về giá trị của biến tĩnh **studentCount**. Phương thức này cho phép truy cập số lượng sinh viên mà không cần đối tượng cụ thể.

### Test lớp Student

* Tạo nhiều đối tượng `Student` và in ra số lượng sinh viên bằng phương thức tĩnh đã tạo.

## Lưu ý

* **Biến tĩnh** là một biến được chia sẻ giữa tất cả các đối tượng của một lớp, nên nó có thể được truy cập và thay đổi qua tất cả các đối tượng.
* **Phương thức tĩnh** có thể được gọi mà không cần đối tượng cụ thể của lớp, điều này hữu ích cho việc truy xuất thông tin chung như số lượng sinh viên trong trường hợp này.

---

# Bài 2: Xây dựng lớp tiện ích MathUtil

## Đề bài

> Viết một lớp `MathUtil` chứa các phương thức tĩnh (`static`) để thực hiện các chức năng sau:
> * Cộng 2 số.
> * Trừ 2 số.
> * Nhân 2 số.
> * Chia 2 số.
>
>

## Mục tiêu

* Hiểu cách sử dụng phương thức tĩnh trong Java.
* Nắm vững cách thiết kế và sử dụng các phương thức tiện ích.

## Hướng dẫn các bước thực hiện

### Xây dựng lớp MathUtil

Khởi tạo lớp `MathUtil` và thêm các phương thức tĩnh sau:
* **`add(double a, double b)`**: Cộng hai số và trả về kết quả.
* **`subtract(double a, double b)`**: Trừ hai số và trả về kết quả.
* **`multiply(double a, double b)`**: Nhân hai số và trả về kết quả.
* **`divide(double a, double b)`**: Chia hai số và trả về kết quả.



### Test lớp MathUtil

* Trong hàm main của một class khác, gọi các phương thức tĩnh từ lớp `MathUtil` và kiểm tra kết quả.

## * Lưu ý

* Các phương thức tĩnh nên được thiết kế để có thể tái sử dụng trong các chương trình khác nhau, nên cố gắng viết chúng một cách tổng quát nhất có thể.

---

# Bài 3. Xây dựng lớp tiện ích LocalDateUtil

## Đề bài

> Tạo một lớp `LocalDateUtil` gồm các phương thức tĩnh (`static`) để thực hiện các chức năng sau:
> * Chuyển đổi chuỗi với định dạng `dd/MM/yyyy` sang `LocalDate`.
> * Chuyển đổi chuỗi với định dạng `yyyy/MM/dd` sang `LocalDate`.
> * Chuyển đổi `LocalDate` với định dạng sang chuỗi với định dạng `dd/MM/yyyy`.
> * Chuyển đổi `LocalDate` với định dạng sang chuỗi với định dạng `yyyy/MM/dd`.
>
>

## Mục tiêu

* Hiểu cách sử dụng `DateTimeFormatter` để chuyển đổi giữa chuỗi và `LocalDate`.
* Thực hiện được việc chuyển đổi định dạng ngày tháng sử dụng Java 8.

## Hướng dẫn các bước thực hiện

### Xây dựng lớp LocalDateUtil

Khởi tạo lớp `LocalDateUtil` và thêm các phương thức tĩnh sau:
* **`fromString_ddMMyyyy(String date)`**: Chuyển đổi chuỗi với định dạng `dd/MM/yyyy` sang `LocalDate`.
* **`fromString_yyyyMMdd(String date)`**: Chuyển đổi chuỗi với định dạng `yyyy/MM/dd` sang `LocalDate`.
* **`toString_ddMMyyyy(LocalDate date)`**: Chuyển đổi `LocalDate` sang chuỗi với định dạng `dd/MM/yyyy`.
* **`toString_yyyyMMdd(LocalDate date)`**: Chuyển đổi `LocalDate` sang chuỗi với định dạng `yyyy/MM/dd`.


* Sử dụng lớp `DateTimeFormatter` để định dạng và phân tích chuỗi ngày.

### Test lớp LocalDateUtil

* Trong hàm `main` của một class khác, gọi các phương thức tĩnh từ lớp `LocalDateUtil` và kiểm tra kết quả.

## Lưu ý

* Đảm bảo rằng định dạng đầu vào đúng với định dạng được đề ra trong các phương thức chuyển đổi.
* Các phương thức tĩnh nên được thiết kế để có thể tái sử dụng trong các chương trình khác nhau, nên cố gắng viết chúng một cách tổng quát nhất có thể.

---
# Bài tập 4 - Kế thừa - Ứng dụng quản lý điện thoại

## Đề bài

**I. Mô tả chương trình**

Chương trình quản lý điện thoại của một cửa hàng bán điện thoại di động.
Điện thoại được chia làm 2 loại:

* Điện thoại mới
* Điện thoại cũ

Các loại điện thoại này sẽ bao gồm các thông tin: **id, Tên điện thoại, Giá bán, Thời gian bảo hành, Hãng sản xuất** (ví dụ: iPhone, Samsung, ...)

**Quy tắc ID:**
Đối với **id** của mỗi điện thoại sẽ tự động tăng theo quy tắc sau:

* Đối với **điện thoại mới**: id sẽ có dạng `"DTMXXX"`, trong đó "X" là một số từ 0 đến 9.
* Đối với **điện thoại cũ**: id sẽ có dạng `"DTCXXX"`, trong đó "X" là một số từ 0 đến 9.

**Thông tin riêng:**

* Đối với **điện thoại cũ** có thêm thông tin:
* Tình trạng pin (Còn bao nhiêu phần trăm)
* Mô tả thêm


* Đối với **điện thoại mới** có thêm thông tin:
* Số lượng



## Hướng dẫn các bước thực hiện

**II. Yêu cầu chương trình**

### Task 1: Tạo menu

*(Chỉ yêu cầu tạo menu chương trình sử dụng các vòng lặp, không yêu cầu viết code các chức năng)*

-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI --

1. Xem danh sách điện thoại
2. Thêm mới
3. Cập nhật
4. Xóa
5. Sắp xếp theo giá
6. Tìm kiếm
7. Tính tổng tiền
8. Giảm giá cho điện thoại cũ
9. Thoát

**Chi tiết các menu con:**

* Khi chọn chức năng số **1. Xem danh sách điện thoại** thì chương trình hiển thị thanh menu con bao gồm:
1. Xem tất cả
2. Xem điện thoại cũ
3. Xem điện thoại mới
4. Trở về menu chính


* Khi chọn chức năng số **2. Thêm mới** thì chương trình hiển thị thanh menu con bao gồm:
1. Thêm mới điện thoại cũ
2. Thêm mới điện thoại mới
3. Trở về menu chính


* Khi chọn chức năng số **5. Sắp xếp theo giá** thì chương trình hiển thị thanh menu con bao gồm:
1. Tăng dần
2. Giảm dần
3. Trở về menu chính


* Khi chọn chức năng số **6. Tìm kiếm** thì chương trình hiển thị thanh menu con bao gồm:
1. Tìm kiếm tất cả điện thoại
2. Tìm kiếm điện thoại cũ
3. Tìm kiếm điện thoại mới
4. Trở về menu chính


* Khi lựa chọn vào **1, 2, 3** thì xuất hiện menu:
1. Tìm kiếm theo giá (Nhập khoảng từ bao nhiêu đến bao nhiêu)
2. Tìm kiếm theo tên
3. Tìm kiếm theo hãng
4. Trở về menu Tìm kiếm




* Khi chọn chức năng số **9. Thoát** thì kết thúc chương trình.

### Task 2: Tạo các class, property, method theo OOP

Task này chỉ yêu cầu tạo các class, method, property theo OOP, không yêu cầu viết code các chức năng của chương trình.

### Task 3: Xây dựng hoàn chỉnh các chức năng sau

**Hướng dẫn cơ bản cho task 3**

**1. Xem danh sách điện thoại**

* **Mô tả:**
* **Khởi tạo:** Tạo ra 2 ArrayList chứa thông tin tương ứng của điện thoại cũ và điện thoại mới. Tạo khối static để đưa dữ liệu ban đầu vào cho 2 ArrayList này.


* **Chức năng:**
* **Xem tất cả:** Sử dụng 2 vòng lặp để xuất thông tin của điện thoại cũ và điện thoại mới.
* **Xem điện thoại cũ:** Sử dụng vòng lặp để xuất thông tin của điện thoại cũ.
* **Xem điện thoại mới:** Sử dụng vòng lặp để xuất thông tin của điện thoại mới.



**2. Thêm mới**

* **Mô tả:**
* **Chọn chức năng thêm mới:**
1. **Thêm mới điện thoại cũ:** Gọi đến phương thức input của điện thoại cũ, xử lý id tự động tăng theo format quy định.
2. **Thêm mới điện thoại mới:** Gọi đến phương thức input của điện thoại mới, xử lý id tự động tăng theo format quy định.





**3. Cập nhật**

* **Mô tả:**
* **Nhập id:** Người dùng nhập vào id, kiểm tra format id (6 ký tự, bắt đầu bằng DTC hoặc DTM).
* **Nếu sai format:** Báo lỗi.
* **Duyệt trong ArrayList tương ứng:** Duyệt thông tin trong ArrayList điện thoại cũ hoặc mới.
* **Nếu không tìm thấy:** Báo id không tồn tại.
* **Nếu tìm thấy:** Gọi đến phương thức input của điện thoại tương ứng để cập nhật thông tin, sau đó báo cập nhật thành công.



**4. Xóa**

* **Mô tả:**
* **Nhập id:** Người dùng nhập vào id, kiểm tra format id (6 ký tự, bắt đầu bằng DTC hoặc DTM).
* **Nếu sai format:** Báo lỗi.
* **Duyệt trong ArrayList tương ứng:** Duyệt thông tin trong ArrayList điện thoại cũ hoặc mới.
* **Nếu không tìm thấy:** Báo id không tồn tại.
* **Nếu tìm thấy:** Thực hiện xóa đối tượng khỏi danh sách và thông báo xóa thành công.