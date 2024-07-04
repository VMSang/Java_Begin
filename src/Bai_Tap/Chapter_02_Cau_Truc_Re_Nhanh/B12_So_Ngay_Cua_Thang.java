package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B12_So_Ngay_Cua_Thang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, n;
        t = sc.nextInt();
        n = sc.nextInt();
        if (t > 0 && n > 0 && t < 13) {
            if ((n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) && t == 2)
                System.out.println("29");
            else if (t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12)
                System.out.println("31");
            else
                System.out.println("30");
        } else {
            System.out.println("INVALID");
        }
    }
}
