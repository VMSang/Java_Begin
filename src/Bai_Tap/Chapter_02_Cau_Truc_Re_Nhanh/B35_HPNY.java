package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B35_HPNY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();

        System.out.println(1440 - (h * 60 + m));
    }
}
