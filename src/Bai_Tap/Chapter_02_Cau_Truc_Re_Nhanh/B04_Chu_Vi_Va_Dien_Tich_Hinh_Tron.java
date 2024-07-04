package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B04_Chu_Vi_Va_Dien_Tich_Hinh_Tron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14;
        int r = sc.nextInt();
        System.out.printf("%.4f", 2 * PI * r);
        System.out.printf(" %.4f", PI * Math.pow(r, 2));
    }
}
