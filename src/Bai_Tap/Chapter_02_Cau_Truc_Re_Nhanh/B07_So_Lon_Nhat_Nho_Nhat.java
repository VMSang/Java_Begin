package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B07_So_Lon_Nhat_Nho_Nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println((a / b) * b);
        System.out.println((a + b - 1) / b * b);
    }
}
