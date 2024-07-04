package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B07_Chu_So_Cuoi_Cung_Va_Hai_Chu_So_Cuoi_Cung {
    public B07_Chu_So_Cuoi_Cung_Va_Hai_Chu_So_Cuoi_Cung() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(x % 10L);
        System.out.println(x % 100L);
    }
}