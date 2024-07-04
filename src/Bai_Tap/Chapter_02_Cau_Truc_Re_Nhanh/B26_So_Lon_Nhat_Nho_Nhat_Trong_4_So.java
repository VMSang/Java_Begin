package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B26_So_Lon_Nhat_Nho_Nhat_Trong_4_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c, d;
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        d = sc.nextLong();

        long max = a, min = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        System.out.println(max + " " + min);
    }
}
