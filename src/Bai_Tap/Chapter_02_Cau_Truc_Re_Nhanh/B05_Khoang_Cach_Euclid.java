package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B05_Khoang_Cach_Euclid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1, x2, y1, y2;
        x1 = sc.nextLong();
        y1 = sc.nextLong();
        x2 = sc.nextLong();
        y2 = sc.nextLong();
        System.out.printf("%.2f", Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }
}
