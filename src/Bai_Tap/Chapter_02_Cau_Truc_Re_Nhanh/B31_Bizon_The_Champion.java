package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B31_Bizon_The_Champion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, a3, b1, b2, b3, n;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        b3 = sc.nextInt();
        n = sc.nextInt();

        int keCup = ((a1 + a2 + a3) + 5 - 1) / 5;
        int keHuyChuong = ((b1 + b2 + b3) + 10 - 1) / 10;
        if (keCup + keHuyChuong > n) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
