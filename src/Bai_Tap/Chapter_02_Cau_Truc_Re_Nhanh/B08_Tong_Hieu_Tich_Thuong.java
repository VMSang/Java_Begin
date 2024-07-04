package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B08_Tong_Hieu_Tich_Thuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if (b != 0) {
            System.out.println(a / b);
        } else System.out.println("INVALID");
    }
}
