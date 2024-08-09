package Ly_Thuyet;

import java.math.BigInteger;
import java.util.Scanner;

public class Ly_Thuyet_09_String {
    // Hàm chuẩn hóa tên
    public static void chuanHoaTen() {
        String s = "NgUYEN ThUY liNh";
        StringBuilder sb = new StringBuilder("");
        String[] arr = s.split("\\s+");

        for (String x : arr) {
            sb.append(Character.toUpperCase(x.charAt(0))); // Chữ cái đầu tiên in hoa
            for (int j = 1; j < x.length(); j++) {
                sb.append(Character.toLowerCase(x.charAt(j))); // Các chữ cái còn lại in thường
            }
            sb.append(" "); //noi chuoi
        }

        sb.deleteCharAt(sb.length() - 1); // Xóa dấu cách thừa ở cuối
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Chú ý: String trong Java một khi đã khai báo thì không thể thay đổi
        // Các hàm áp dụng lên String sẽ trả về chuỗi mới, để thay đổi thì dùng StringBuilder

        // Các phương thức của lớp String:
        // length()           - Trả về độ dài chuỗi
        // charAt(int index)  - Trả về ký tự tại vị trí index
        // toUpperCase()      - Chuyển chuỗi thành chữ in hoa (không thay đổi chuỗi gốc)
        // toLowerCase()      - Chuyển chuỗi thành chữ in thường (không thay đổi chuỗi gốc)

        // Chuyển chuỗi thành mảng char
        // String s = "example";
        // char[] chars = s.toCharArray();

        // Chuyển một số char thành số bình thường
        // char c = '5';
        // int number = c - '0'; // Chuyển char '5' thành int 5

        // Ghép chuỗi
        // String t = "Hello";
        // String s = "World";
        // String result = t.concat(s); // Tương đương với t + s

        // So sánh chuỗi
        // compareTo() so sánh hai chuỗi theo thứ tự từ điển
        // compareToIgnoreCase() bỏ qua sự khác biệt giữa chữ hoa và chữ thường

        // Trả về xâu con
        // String substring = s.substring(startIndex, endIndex);

        // Kiểm tra sự tồn tại của xâu con
        // boolean contains = s.contains("sub");

        // Tách từ trong chuỗi:
        // Cách 1: Sử dụng split() với regex
        // String[] arr = s.split("\\s+");
        // Cách 2: Sử dụng StringTokenizer (đã bị đánh giá là lỗi thời)
        // StringTokenizer tokenizer = new StringTokenizer(s);

        // Các hàm chức năng:
        // isDigit(char c)         - Kiểm tra ký tự có phải là chữ số không
        // isLowerCase(char c)    - Kiểm tra ký tự có phải là chữ in thường không
        // isUpperCase(char c)    - Kiểm tra ký tự có phải là chữ in hoa không
        // isAlphabetic(char c)   - Kiểm tra ký tự có phải là chữ cái không
        // char toLower(char c)   - Chuyển ký tự thành chữ in thường
        // char toUpper(char c)   - Chuyển ký tự thành chữ in hoa

        // Chuyển số thành chuỗi ký tự
        int number = 123;
        String str = number + ""; // Chuyển số thành chuỗi
        int number2 = 123;
        String str2 = String.valueOf(number2); // Chuyển số thành chuỗi

        // Chuyển đổi chuỗi thành số
        String str3 = "123";
        int number3 = Integer.parseInt(str3); // Chuyển chuỗi thành số nguyên

        // Tương tự cho các kiểu số khác:
        // long number4 = Long.parseLong(str3);
        // float number5 = Float.parseFloat(str3);
        // double number6 = Double.parseDouble(str3);

        // Xử lý số nguyên lớn bằng lớp BigInteger
        String s1 = "18238128381283812381123123123123";
        String s2 = "192399239192393";

        // Chuyển các chuỗi số thành đối tượng BigInteger
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);

        // Thực hiện các phép toán và in kết quả
        System.out.println(num1.add(num2));       // Cộng
        System.out.println(num1.subtract(num2));  // Trừ
        System.out.println(num1.multiply(num2));  // Nhân
        System.out.println(num1.divide(num2));    // Chia
    }
}
