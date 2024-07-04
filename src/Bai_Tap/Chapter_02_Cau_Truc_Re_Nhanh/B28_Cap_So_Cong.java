package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B28_Cap_So_Cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, u1, d;
        n = sc.nextInt();
        u1 = sc.nextInt();
        d = sc.nextInt();

        long un = u1 + (n - 1) * d;
        long sn = (n * (u1 + un)) / 2;
        System.out.println(sn);
    }
}
