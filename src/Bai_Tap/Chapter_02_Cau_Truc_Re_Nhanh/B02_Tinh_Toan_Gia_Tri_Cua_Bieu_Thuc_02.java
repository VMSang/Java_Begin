package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B02_Tinh_Toan_Gia_Tri_Cua_Bieu_Thuc_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        System.out.println(a * (b + c) + b * (a + c));
    }
}
