package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B24_Duong_Di_Ngan_Nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long d1, d2, d3;
        d1 = sc.nextLong();
        d2 = sc.nextLong();
        d3 = sc.nextLong();
        long cach1 = d1 * 2 + d2 * 2;
        long cach2 = d1 + d2 + d3;
        long cach3 = d1 * 2 + d3 * 2;
        long cach4 = d2 * 2 + d3 * 2;
        System.out.println(Math.min(Math.min(Math.min(cach4, cach3), cach2), cach1));
    }
}
