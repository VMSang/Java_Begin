package Bai_Tap.Chapter_02_Cau_Truc_Re_Nhanh;

import java.util.Scanner;

public class B14_Xep_Loai_Hoc_Sinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        double sum = (a + b + c * 2 + d * 3) / 7.0;
        if (sum >= 8) {
            System.out.println("GIOI");
        } else if (sum >= 6.5) {
            System.out.println("KHA");
        } else if (sum >= 5) {
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
    }
}
