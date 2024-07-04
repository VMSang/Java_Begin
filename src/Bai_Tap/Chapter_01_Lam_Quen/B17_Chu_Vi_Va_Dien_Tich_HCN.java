package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B17_Chu_Vi_Va_Dien_Tich_HCN {
    public B17_Chu_Vi_Va_Dien_Tich_HCN() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println("Chu vi HCN la : " + (a + b) * 2L);
        System.out.println("Dien tich HCN la : " + a * b);
    }
}