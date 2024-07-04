package Ly_Thuyet;

public class Ly_Thuyet_02_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        int value = c + 1; // value sẽ là 66
        char nextChar = (char) value; // nextChar sẽ là 'B'
        char ch1 = 'a';
        char ch2 = '1';
        char ch3 = 'A';
        char ch4 = ' ';

        // Kiểm tra xem ký tự có phải là chữ cái không
        System.out.println(Character.isLetter(ch1)); // true

        // Kiểm tra xem ký tự có phải là chữ số không
        System.out.println(Character.isDigit(ch2)); // true

        // Kiểm tra xem ký tự có phải là chữ cái hoặc chữ số không
        System.out.println(Character.isLetterOrDigit(ch1)); // true
        System.out.println(Character.isLetterOrDigit(ch2)); // true
        System.out.println(Character.isLetterOrDigit('@')); // false

        // Kiểm tra xem ký tự có phải là chữ hoa không
        System.out.println(Character.isUpperCase(ch3)); // true
        System.out.println(Character.isUpperCase(ch1)); // false

        // Kiểm tra xem ký tự có phải là chữ thường không
        System.out.println(Character.isLowerCase(ch1)); // true
        System.out.println(Character.isLowerCase(ch3)); // false

        // Kiểm tra xem ký tự có phải là ký tự khoảng trắng không
        System.out.println(Character.isWhitespace(ch4)); // true

        // Chuyển ký tự thành chữ hoa
        System.out.println(Character.toUpperCase(ch1)); // 'A'

        // Chuyển ký tự thành chữ thường
        System.out.println(Character.toLowerCase(ch3)); // 'a'

        // Chuyển ký tự thành chuỗi
        System.out.println(Character.toString(ch1)); // "a"

        // Lấy giá trị số nguyên của ký tự
        System.out.println((int) ch1); // 97 (mã ASCII của 'a')

        // Kiểm tra xem ký tự có thể tạo thành một phần của tên định danh trong Java không
        System.out.println(Character.isJavaIdentifierPart(ch1)); // true

        // Kiểm tra xem ký tự có thể là ký tự đầu tiên của tên định danh trong Java không
        System.out.println(Character.isJavaIdentifierStart(ch1)); // true
    }
}
