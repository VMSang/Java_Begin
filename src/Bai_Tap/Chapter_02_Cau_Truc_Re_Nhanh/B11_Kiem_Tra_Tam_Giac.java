package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B11_Kiem_Tra_Tam_Giac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        if ((a > 0 && b > 0 && c > 0) && (a + b > c) && (a + c > b) && (b + c) > a) {
            if (a == b && b == c)
                System.out.println("1");
            else if (a == b || a == c || b == c) {
                System.out.println("2");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
