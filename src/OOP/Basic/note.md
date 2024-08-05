## Mục tiêu của OOP

Mục tiêu của OOP (Object-Oriented Programming) là cố gắng đưa các thực thể, đối tượng trong thực tế vào phần mềm.

### Access Specifier

- **Public**: Các thành viên có thể được truy cập từ bất kỳ đâu.
- **Protected**: Các thành viên có thể được truy cập từ lớp hiện tại và các lớp con.
- **Private**: Các thành viên chỉ có thể được truy cập từ lớp hiện tại.

### Hàm tạo (Constructor)

- Hàm tạo được gọi khi một đối tượng được khởi tạo. Ví dụ: `public SinhVien() { }`
- Hàm tạo có tên trùng với tên class, không có kiêu trả về
- Có thể có nhiều hàm tạo miễn là khác tham số

### Con trỏ `this`

- `this` là con trỏ dùng để tham chiếu đến đối tượng hiện tại trong lớp. Nó giúp dễ hiểu hơn khi truy cập các thuộc tính
  và phương thức của đối tượng.

### Getter/Setter

- Getter: Phương thức dùng để lấy giá trị của thuộc tính `private`.
- Setter: Phương thức dùng để thay đổi giá trị của thuộc tính `private`.

### Hàm `toString()`

- Hàm `toString()` dùng để hiển thị thuộc tính của đối tượng thay vì địa chỉ. Ví dụ:
  ```java
  @Override
  public String toString() {
      return "Thông tin của đối tượng";
  }

-Có thể dùng để lấy thông tin của đối tượng nhanh, đỡ phải dùng getter

### Static

- **Static**: Dùng cho thuộc tính hoặc phương thức chung cho toàn bộ các đối tượng của lớp. Ví dụ:
  ```java
  private static int cnt = 0;
  public static void methodName() { }

### Mảng và ArrayList

- Có thể sử dụng mảng (`array`) hoặc danh sách (`ArrayList`) nhưng không dùng `Set` hay `Map` vì chúng cần điều kiện cụ
  thể, và điều kiện đó không được định nghĩa rõ ràng trong lớp của bạn.
