package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B32_Ghep_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k2, k3, k5, k6;
        k2 = sc.nextLong();
        k3 = sc.nextLong();
        k5 = sc.nextLong();
        k6 = sc.nextLong();

        long MIN256 = Math.min(k2, Math.min(k5, k6));
        long sum = MIN256 * 256;
        k2 -= MIN256;
        k5 -= MIN256;
        k6 -= MIN256;

        long MIN32 = Math.min(k2, k3);
        sum += MIN32 * 32;

        System.out.println(sum);
    }
}
