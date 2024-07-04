package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B01_Tinh_Toan_Gia_Tri_Cua_Bieu_Thuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println((long) Math.pow(x, 3) + 3 * (long) Math.pow(x, 2) + x + 1);
    }
}
