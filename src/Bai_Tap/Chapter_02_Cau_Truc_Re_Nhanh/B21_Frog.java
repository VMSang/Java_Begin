package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B21_Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, k;
        a = sc.nextLong();
        b = sc.nextLong();
        k = sc.nextLong();
        long vitri = 0;
        if (k % 2 == 0) {
            vitri = (k / 2 * a) - (k / 2 * b);
        } else {
            vitri = (k / 2 * a + a) - (k / 2 * b);
        }
        System.out.println(vitri);
    }
}
