package Bai_Tap.Chapter_01_Lam_Quen;

import java.util.Scanner;

public class B11_Nhan_Chia {
    public B11_Nhan_Chia() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = (long) sc.nextInt();
        System.out.println(2L * n);
        System.out.println();
        System.out.println(10L * n);
        System.out.println();
        System.out.println(n / 2L);
        System.out.println();
        System.out.printf("%.3f", (double) n / 2.0);
    }
}